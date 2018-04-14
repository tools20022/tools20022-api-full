/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * The value of the field "EDSMessagingCountryCode" conditions the presence of
 * certain details that clients will need to submit as part of their CAIN
 * Instruction when combined with the following rules:<br>
 * a. If the value equals “CA” (Canada), and the option types = FCPX (Foreign
 * Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP
 * Exempt)) the Tax Exempt component must be populated in the CAIN extension;<br>
 * b. All Foreign Currency Payments (FCP) require wire information when
 * submitting elections via ISO 20022 messaging, with 1 exception: If
 * "EDSMessagingCountryCode" value is “CA” (Canada) and the extensions option
 * action type is FCPU, FCPF, FCPX, then no wire instructions are required.
 */
public class ConstraintEDSMessagingCountryCodeGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD17
	 * CorporateActionSD17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingCountryCodeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline#forCorporateActionSD14
	 * ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD14}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionSD17> forCorporateActionSD17 = new MMConstraint<CorporateActionSD17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingCountryCodeGuideline";
			definition = "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD14;
			owner_lazy = () -> CorporateActionSD17.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionSD17 obj) throws Exception {
			checkCorporateActionSD17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD11
	 * CorporateActionSD11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingCountryCodeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline#forCorporateActionSD13
	 * ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD13}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionSD11> forCorporateActionSD11 = new MMConstraint<CorporateActionSD11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingCountryCodeGuideline";
			definition = "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD13);
			owner_lazy = () -> CorporateActionSD11.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionSD11 obj) throws Exception {
			checkCorporateActionSD11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD14
	 * CorporateActionSD14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingCountryCodeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline#forCorporateActionSD17
	 * ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD17}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline#forCorporateActionSD13
	 * ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD13}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionSD14> forCorporateActionSD14 = new MMConstraint<CorporateActionSD14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingCountryCodeGuideline";
			definition = "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD17);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD13;
			owner_lazy = () -> CorporateActionSD14.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionSD14 obj) throws Exception {
			checkCorporateActionSD14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD7
	 * CorporateActionSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingCountryCodeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionSD7> forCorporateActionSD7 = new MMConstraint<CorporateActionSD7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingCountryCodeGuideline";
			definition = "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required.";
			owner_lazy = () -> CorporateActionSD7.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionSD7 obj) throws Exception {
			checkCorporateActionSD7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionSD13
	 * CorporateActionSD13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EDSMessagingCountryCodeGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline#forCorporateActionSD14
	 * ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD14}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline#forCorporateActionSD11
	 * ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD11}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionSD13> forCorporateActionSD13 = new MMConstraint<CorporateActionSD13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EDSMessagingCountryCodeGuideline";
			definition = "The value of the field \"EDSMessagingCountryCode\" conditions the presence of certain details that clients will need to submit as part of their CAIN Instruction when combined with the following rules:\r\na.\tIf the value equals “CA” (Canada), and the option types = FCPX (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the CAIN extension;\r\nb.\tAll Foreign Currency Payments (FCP) require wire information when submitting elections via ISO 20022 messaging, with 1 exception: If \"EDSMessagingCountryCode\" value is “CA” (Canada) and the extensions option action type is FCPU, FCPF, FCPX, then no wire instructions are required.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD14);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintEDSMessagingCountryCodeGuideline.forCorporateActionSD11;
			owner_lazy = () -> CorporateActionSD13.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionSD13 obj) throws Exception {
			checkCorporateActionSD13(obj);
		}
	};

	/**
	 * The value of the field "EDSMessagingCountryCode" conditions the presence
	 * of certain details that clients will need to submit as part of their CAIN
	 * Instruction when combined with the following rules:<br>
	 * a. If the value equals “CA” (Canada), and the option types = FCPX
	 * (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or
	 * DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the
	 * CAIN extension;<br>
	 * b. All Foreign Currency Payments (FCP) require wire information when
	 * submitting elections via ISO 20022 messaging, with 1 exception: If
	 * "EDSMessagingCountryCode" value is “CA” (Canada) and the extensions
	 * option action type is FCPU, FCPF, FCPX, then no wire instructions are
	 * required.
	 */
	public static void checkCorporateActionSD17(CorporateActionSD17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The value of the field "EDSMessagingCountryCode" conditions the presence
	 * of certain details that clients will need to submit as part of their CAIN
	 * Instruction when combined with the following rules:<br>
	 * a. If the value equals “CA” (Canada), and the option types = FCPX
	 * (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or
	 * DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the
	 * CAIN extension;<br>
	 * b. All Foreign Currency Payments (FCP) require wire information when
	 * submitting elections via ISO 20022 messaging, with 1 exception: If
	 * "EDSMessagingCountryCode" value is “CA” (Canada) and the extensions
	 * option action type is FCPU, FCPF, FCPX, then no wire instructions are
	 * required.
	 */
	public static void checkCorporateActionSD11(CorporateActionSD11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The value of the field "EDSMessagingCountryCode" conditions the presence
	 * of certain details that clients will need to submit as part of their CAIN
	 * Instruction when combined with the following rules:<br>
	 * a. If the value equals “CA” (Canada), and the option types = FCPX
	 * (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or
	 * DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the
	 * CAIN extension;<br>
	 * b. All Foreign Currency Payments (FCP) require wire information when
	 * submitting elections via ISO 20022 messaging, with 1 exception: If
	 * "EDSMessagingCountryCode" value is “CA” (Canada) and the extensions
	 * option action type is FCPU, FCPF, FCPX, then no wire instructions are
	 * required.
	 */
	public static void checkCorporateActionSD14(CorporateActionSD14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The value of the field "EDSMessagingCountryCode" conditions the presence
	 * of certain details that clients will need to submit as part of their CAIN
	 * Instruction when combined with the following rules:<br>
	 * a. If the value equals “CA” (Canada), and the option types = FCPX
	 * (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or
	 * DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the
	 * CAIN extension;<br>
	 * b. All Foreign Currency Payments (FCP) require wire information when
	 * submitting elections via ISO 20022 messaging, with 1 exception: If
	 * "EDSMessagingCountryCode" value is “CA” (Canada) and the extensions
	 * option action type is FCPU, FCPF, FCPX, then no wire instructions are
	 * required.
	 */
	public static void checkCorporateActionSD7(CorporateActionSD7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The value of the field "EDSMessagingCountryCode" conditions the presence
	 * of certain details that clients will need to submit as part of their CAIN
	 * Instruction when combined with the following rules:<br>
	 * a. If the value equals “CA” (Canada), and the option types = FCPX
	 * (Foreign Currency Payment Exempt), FORX (Foreign Tax Relief Exempt), or
	 * DRPX (DRIP Exempt)) the Tax Exempt component must be populated in the
	 * CAIN extension;<br>
	 * b. All Foreign Currency Payments (FCP) require wire information when
	 * submitting elections via ISO 20022 messaging, with 1 exception: If
	 * "EDSMessagingCountryCode" value is “CA” (Canada) and the extensions
	 * option action type is FCPU, FCPF, FCPX, then no wire instructions are
	 * required.
	 */
	public static void checkCorporateActionSD13(CorporateActionSD13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}