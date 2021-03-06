package com.devyy.oys.leetcode.presenter.cloud.web;

import com.devyy.oys.srarter.leetcode.presenter.service.ILeetcodeGeneratorService;
import com.devyy.oys.srarter.leetcode.presenter.web.ILeetcodeGeneratorWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @since 2019-02-09
 */
@Component
public class LeetcodeGeneratorController implements ILeetcodeGeneratorWeb {
    @Autowired
    private ILeetcodeGeneratorService leetcodeGeneratorService;

    @Override
    public String step1() {
        return leetcodeGeneratorService.doGeneratorMarkdownFiles();
    }

    @Override
    public String step2() {
        return leetcodeGeneratorService.doGeneratorSidebarFiles();
    }

    @Override
    public String step3() {
        return leetcodeGeneratorService.doGeneratorGitCommitCmd();
    }

    @Override
    public String step4() {
        return leetcodeGeneratorService.doGeneratorHtmlSrcFiles();
    }
}
