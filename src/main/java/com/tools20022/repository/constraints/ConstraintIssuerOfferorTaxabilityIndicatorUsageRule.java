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
 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
 * provided in the message and it must not be used in events such as dividend or
 * interest.
 */
public class ConstraintIssuerOfferorTaxabilityIndicatorUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39
	 * SecuritiesOption39}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption39> forSecuritiesOption39 = new MMConstraint<SecuritiesOption39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> SecuritiesOption39.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption39 obj) throws Exception {
			checkSecuritiesOption39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption36 CashOption36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption36> forCashOption36 = new MMConstraint<CashOption36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> CashOption36.mmObject();
		}

		@Override
		public void executeValidator(CashOption36 obj) throws Exception {
			checkCashOption36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50
	 * SecuritiesOption50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption60
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption60
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption50> forSecuritiesOption50 = new MMConstraint<SecuritiesOption50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption60);
			owner_lazy = () -> SecuritiesOption50.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption50 obj) throws Exception {
			checkSecuritiesOption50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption51 CashOption51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption57
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption57}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption42
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption42}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption51> forCashOption51 = new MMConstraint<CashOption51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption57);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption42;
			owner_lazy = () -> CashOption51.mmObject();
		}

		@Override
		public void executeValidator(CashOption51 obj) throws Exception {
			checkCashOption51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55
	 * SecuritiesOption55}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption55> forSecuritiesOption55 = new MMConstraint<SecuritiesOption55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption55.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption55 obj) throws Exception {
			checkSecuritiesOption55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption67
	 * SecuritiesOption67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption67> forSecuritiesOption67 = new MMConstraint<SecuritiesOption67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption67.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption67 obj) throws Exception {
			checkSecuritiesOption67(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption58
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption58}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption44
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption44}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption52> forCashOption52 = new MMConstraint<CashOption52>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption58);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption44;
			owner_lazy = () -> CashOption52.mmObject();
		}

		@Override
		public void executeValidator(CashOption52 obj) throws Exception {
			checkCashOption52(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64
	 * SecuritiesOption64}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption59
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption59
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption64> forSecuritiesOption64 = new MMConstraint<SecuritiesOption64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption59;
			owner_lazy = () -> SecuritiesOption64.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption64 obj) throws Exception {
			checkSecuritiesOption64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption55 CashOption55}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption55> forCashOption55 = new MMConstraint<CashOption55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption55.mmObject();
		}

		@Override
		public void executeValidator(CashOption55 obj) throws Exception {
			checkCashOption55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption57 CashOption57}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption51
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption51}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption57> forCashOption57 = new MMConstraint<CashOption57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption51;
			owner_lazy = () -> CashOption57.mmObject();
		}

		@Override
		public void executeValidator(CashOption57 obj) throws Exception {
			checkCashOption57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38
	 * SecuritiesOption38}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption40
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption40
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption38> forSecuritiesOption38 = new MMConstraint<SecuritiesOption38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption40);
			owner_lazy = () -> SecuritiesOption38.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption38 obj) throws Exception {
			checkSecuritiesOption38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption61 CashOption61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption61> forCashOption61 = new MMConstraint<CashOption61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption61.mmObject();
		}

		@Override
		public void executeValidator(CashOption61 obj) throws Exception {
			checkCashOption61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption25
	 * SecuritiesOption25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption25> forSecuritiesOption25 = new MMConstraint<SecuritiesOption25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> SecuritiesOption25.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption25 obj) throws Exception {
			checkSecuritiesOption25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63
	 * SecuritiesOption63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption63> forSecuritiesOption63 = new MMConstraint<SecuritiesOption63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption63.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption63 obj) throws Exception {
			checkSecuritiesOption63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68
	 * SecuritiesOption68}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption68> forSecuritiesOption68 = new MMConstraint<SecuritiesOption68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption68.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption68 obj) throws Exception {
			checkSecuritiesOption68(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption58 CashOption58}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption52
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption52}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption58> forCashOption58 = new MMConstraint<CashOption58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption52;
			owner_lazy = () -> CashOption58.mmObject();
		}

		@Override
		public void executeValidator(CashOption58 obj) throws Exception {
			checkCashOption58(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57
	 * SecuritiesOption57}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption57> forSecuritiesOption57 = new MMConstraint<SecuritiesOption57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption57.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption57 obj) throws Exception {
			checkSecuritiesOption57(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49
	 * SecuritiesOption49}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption59
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption59
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption40
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption40
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption49> forSecuritiesOption49 = new MMConstraint<SecuritiesOption49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption59);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption40;
			owner_lazy = () -> SecuritiesOption49.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption49 obj) throws Exception {
			checkSecuritiesOption49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption17 CashOption17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption17> forCashOption17 = new MMConstraint<CashOption17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> CashOption17.mmObject();
		}

		@Override
		public void executeValidator(CashOption17 obj) throws Exception {
			checkCashOption17(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption64
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption64
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption49
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption49
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption59> forSecuritiesOption59 = new MMConstraint<SecuritiesOption59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption64);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption49;
			owner_lazy = () -> SecuritiesOption59.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption59 obj) throws Exception {
			checkSecuritiesOption59(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption32 CashOption32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption43
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption43}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption24
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption24}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption32> forCashOption32 = new MMConstraint<CashOption32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption43);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption24;
			owner_lazy = () -> CashOption32.mmObject();
		}

		@Override
		public void executeValidator(CashOption32 obj) throws Exception {
			checkCashOption32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45
	 * SecuritiesOption45}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption45> forSecuritiesOption45 = new MMConstraint<SecuritiesOption45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> SecuritiesOption45.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption45 obj) throws Exception {
			checkSecuritiesOption45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption56 CashOption56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \"TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption50
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption50}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption56> forCashOption56 = new MMConstraint<CashOption56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \"TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption50;
			owner_lazy = () -> CashOption56.mmObject();
		}

		@Override
		public void executeValidator(CashOption56 obj) throws Exception {
			checkCashOption56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption30
	 * SecuritiesOption30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption30> forSecuritiesOption30 = new MMConstraint<SecuritiesOption30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> SecuritiesOption30.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption30 obj) throws Exception {
			checkSecuritiesOption30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption31 CashOption31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption42
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption42}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption25
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption25}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption31> forCashOption31 = new MMConstraint<CashOption31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption42);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption25;
			owner_lazy = () -> CashOption31.mmObject();
		}

		@Override
		public void executeValidator(CashOption31 obj) throws Exception {
			checkCashOption31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption20 CashOption20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption20> forCashOption20 = new MMConstraint<CashOption20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> CashOption20.mmObject();
		}

		@Override
		public void executeValidator(CashOption20 obj) throws Exception {
			checkCashOption20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44 CashOption44}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption52
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption52}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption44> forCashOption44 = new MMConstraint<CashOption44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption52);
			owner_lazy = () -> CashOption44.mmObject();
		}

		@Override
		public void executeValidator(CashOption44 obj) throws Exception {
			checkCashOption44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption24 CashOption24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption32
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption24> forCashOption24 = new MMConstraint<CashOption24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption32);
			owner_lazy = () -> CashOption24.mmObject();
		}

		@Override
		public void executeValidator(CashOption24 obj) throws Exception {
			checkCashOption24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60
	 * SecuritiesOption60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption65
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption65
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption50
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption50
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption60> forSecuritiesOption60 = new MMConstraint<SecuritiesOption60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption50;
			owner_lazy = () -> SecuritiesOption60.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption60 obj) throws Exception {
			checkSecuritiesOption60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption46 CashOption46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption46> forCashOption46 = new MMConstraint<CashOption46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption46.mmObject();
		}

		@Override
		public void executeValidator(CashOption46 obj) throws Exception {
			checkCashOption46(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24
	 * SecuritiesOption24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption24> forSecuritiesOption24 = new MMConstraint<SecuritiesOption24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> SecuritiesOption24.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption24 obj) throws Exception {
			checkSecuritiesOption24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61
	 * SecuritiesOption61}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption61> forSecuritiesOption61 = new MMConstraint<SecuritiesOption61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption61.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption61 obj) throws Exception {
			checkSecuritiesOption61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption54 CashOption54}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption54> forCashOption54 = new MMConstraint<CashOption54>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption54.mmObject();
		}

		@Override
		public void executeValidator(CashOption54 obj) throws Exception {
			checkCashOption54(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40
	 * SecuritiesOption40}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption49
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption49
	 * }</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption38
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption38
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption40> forSecuritiesOption40 = new MMConstraint<SecuritiesOption40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption49);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption38;
			owner_lazy = () -> SecuritiesOption40.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption40 obj) throws Exception {
			checkSecuritiesOption40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption35 CashOption35}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption35> forCashOption35 = new MMConstraint<CashOption35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> CashOption35.mmObject();
		}

		@Override
		public void executeValidator(CashOption35 obj) throws Exception {
			checkCashOption35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \"TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption63> forCashOption63 = new MMConstraint<CashOption63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \"TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption63.mmObject();
		}

		@Override
		public void executeValidator(CashOption63 obj) throws Exception {
			checkCashOption63(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption28 CashOption28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption28> forCashOption28 = new MMConstraint<CashOption28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> CashOption28.mmObject();
		}

		@Override
		public void executeValidator(CashOption28 obj) throws Exception {
			checkCashOption28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption21 CashOption21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption21> forCashOption21 = new MMConstraint<CashOption21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> CashOption21.mmObject();
		}

		@Override
		public void executeValidator(CashOption21 obj) throws Exception {
			checkCashOption21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption53 CashOption53}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption53> forCashOption53 = new MMConstraint<CashOption53>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption53.mmObject();
		}

		@Override
		public void executeValidator(CashOption53 obj) throws Exception {
			checkCashOption53(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption47 CashOption47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption47> forCashOption47 = new MMConstraint<CashOption47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption47.mmObject();
		}

		@Override
		public void executeValidator(CashOption47 obj) throws Exception {
			checkCashOption47(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption60 CashOption60}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption60> forCashOption60 = new MMConstraint<CashOption60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption60.mmObject();
		}

		@Override
		public void executeValidator(CashOption60 obj) throws Exception {
			checkCashOption60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption49 CashOption49}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption49> forCashOption49 = new MMConstraint<CashOption49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption49.mmObject();
		}

		@Override
		public void executeValidator(CashOption49 obj) throws Exception {
			checkCashOption49(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption29 CashOption29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption29> forCashOption29 = new MMConstraint<CashOption29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> CashOption29.mmObject();
		}

		@Override
		public void executeValidator(CashOption29 obj) throws Exception {
			checkCashOption29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65
	 * SecuritiesOption65}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forSecuritiesOption60
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption60
	 * }</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption65> forSecuritiesOption65 = new MMConstraint<SecuritiesOption65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document \" TXAP Taxability Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forSecuritiesOption60;
			owner_lazy = () -> SecuritiesOption65.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption65 obj) throws Exception {
			checkSecuritiesOption65(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption37
	 * SecuritiesOption37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption37> forSecuritiesOption37 = new MMConstraint<SecuritiesOption37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> SecuritiesOption37.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption37 obj) throws Exception {
			checkSecuritiesOption37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29
	 * SecuritiesOption29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption29> forSecuritiesOption29 = new MMConstraint<SecuritiesOption29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> SecuritiesOption29.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption29 obj) throws Exception {
			checkSecuritiesOption29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption43 CashOption43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption50
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption32
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption32}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption43> forCashOption43 = new MMConstraint<CashOption43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption32;
			owner_lazy = () -> CashOption43.mmObject();
		}

		@Override
		public void executeValidator(CashOption43 obj) throws Exception {
			checkCashOption43(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption33
	 * SecuritiesOption33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption33> forSecuritiesOption33 = new MMConstraint<SecuritiesOption33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> SecuritiesOption33.mmObject();
		}

		@Override
		public void executeValidator(SecuritiesOption33 obj) throws Exception {
			checkSecuritiesOption33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption16 CashOption16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption16> forCashOption16 = new MMConstraint<CashOption16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			owner_lazy = () -> CashOption16.mmObject();
		}

		@Override
		public void executeValidator(CashOption16 obj) throws Exception {
			checkCashOption16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption25 CashOption25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption31
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption31}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption25> forCashOption25 = new MMConstraint<CashOption25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption31);
			owner_lazy = () -> CashOption25.mmObject();
		}

		@Override
		public void executeValidator(CashOption25 obj) throws Exception {
			checkCashOption25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption42 CashOption42}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption51
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption51}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption31
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption31}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption42> forCashOption42 = new MMConstraint<CashOption42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of IssuerOfferorTaxabilityIndicator codes to be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption51);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption31;
			owner_lazy = () -> CashOption42.mmObject();
		}

		@Override
		public void executeValidator(CashOption42 obj) throws Exception {
			checkCashOption42(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption50 CashOption50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicatorUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption56
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption56}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule#forCashOption43
	 * ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption43}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption50> forCashOption50 = new MMConstraint<CashOption50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerOfferorTaxabilityIndicatorUsageRule";
			definition = "The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is provided in the message and it must not be used in events such as dividend or interest.\r\nThe list of proprietary IssuerOfferorTaxabilityIndicator codes that may be used are provided in the document titled \" TXAP Taxability Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIssuerOfferorTaxabilityIndicatorUsageRule.forCashOption43;
			owner_lazy = () -> CashOption50.mmObject();
		}

		@Override
		public void executeValidator(CashOption50 obj) throws Exception {
			checkCashOption50(obj);
		}
	};

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption39(SecuritiesOption39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption36(CashOption36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption50(SecuritiesOption50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption51(CashOption51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption55(SecuritiesOption55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption67(SecuritiesOption67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption52(CashOption52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption64(SecuritiesOption64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption55(CashOption55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption57(CashOption57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption38(SecuritiesOption38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption61(CashOption61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption25(SecuritiesOption25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption63(SecuritiesOption63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption68(SecuritiesOption68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption58(CashOption58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption57(SecuritiesOption57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption49(SecuritiesOption49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption17(CashOption17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption59(SecuritiesOption59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption32(CashOption32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption45(SecuritiesOption45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document "TXAP Taxability Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption56(CashOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption30(SecuritiesOption30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption31(CashOption31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption20(CashOption20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption44(CashOption44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption24(CashOption24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption60(SecuritiesOption60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption46(CashOption46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption24(SecuritiesOption24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption61(SecuritiesOption61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption54(CashOption54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption40(SecuritiesOption40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption35(CashOption35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document "TXAP Taxability Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption63(CashOption63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption28(CashOption28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption21(CashOption21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption53(CashOption53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption47(CashOption47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption60(CashOption60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption49(CashOption49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption29(CashOption29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document " TXAP Taxability Codes" available
	 * on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption65(SecuritiesOption65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption37(SecuritiesOption37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption29(SecuritiesOption29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption43(CashOption43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkSecuritiesOption33(SecuritiesOption33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption16(CashOption16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.
	 */
	public static void checkCashOption25(CashOption25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of IssuerOfferorTaxabilityIndicator codes to be used are
	 * provided in the document titled " TXAP Taxability Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption42(CashOption42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The IssuerOfferorTaxabilityIndicator may only be used when no tax rate is
	 * provided in the message and it must not be used in events such as
	 * dividend or interest.<br>
	 * The list of proprietary IssuerOfferorTaxabilityIndicator codes that may
	 * be used are provided in the document titled " TXAP Taxability Codes" that
	 * is available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption50(CashOption50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}