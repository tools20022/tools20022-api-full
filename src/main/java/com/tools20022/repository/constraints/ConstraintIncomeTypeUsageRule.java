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
 * The lists of income type codes to be used in IncomeType are provided in the
 * document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
 * available on the SMPG website at www.smpg.info.
 */
public class ConstraintIncomeTypeUsageRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption44 CashOption44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption52
	 * ConstraintIncomeTypeUsageRule.forCashOption52}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption44> forCashOption44 = new MMConstraint<CashOption44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption52);
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49
	 * SecuritiesOption49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption59
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption59}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption49> forSecuritiesOption49 = new MMConstraint<SecuritiesOption49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption59);
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
	 * {@linkplain com.tools20022.repository.msg.CashOption42 CashOption42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption51
	 * ConstraintIncomeTypeUsageRule.forCashOption51}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption42> forCashOption42 = new MMConstraint<CashOption42>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption51);
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
	 * {@linkplain com.tools20022.repository.msg.CashOption43 CashOption43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption50
	 * ConstraintIncomeTypeUsageRule.forCashOption50}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption43> forCashOption43 = new MMConstraint<CashOption43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption50);
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50
	 * SecuritiesOption50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption60
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption60}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption50> forSecuritiesOption50 = new MMConstraint<SecuritiesOption50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption60);
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
	 * {@linkplain com.tools20022.repository.msg.CashOption46 CashOption46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption46> forCashOption46 = new MMConstraint<CashOption46>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55
	 * SecuritiesOption55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption55> forSecuritiesOption55 = new MMConstraint<SecuritiesOption55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption49 CashOption49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption49> forCashOption49 = new MMConstraint<CashOption49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption47 CashOption47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption47> forCashOption47 = new MMConstraint<CashOption47>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57
	 * SecuritiesOption57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption57> forSecuritiesOption57 = new MMConstraint<SecuritiesOption57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption52 CashOption52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption58
	 * ConstraintIncomeTypeUsageRule.forCashOption58}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption44
	 * ConstraintIncomeTypeUsageRule.forCashOption44}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption52> forCashOption52 = new MMConstraint<CashOption52>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption58);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption44;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60
	 * SecuritiesOption60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption65
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption65}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption50
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption50}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption60> forSecuritiesOption60 = new MMConstraint<SecuritiesOption60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption65);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption50;
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
	 * {@linkplain com.tools20022.repository.msg.CashOption51 CashOption51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption57
	 * ConstraintIncomeTypeUsageRule.forCashOption57}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption42
	 * ConstraintIncomeTypeUsageRule.forCashOption42}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption51> forCashOption51 = new MMConstraint<CashOption51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption57);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption42;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59
	 * SecuritiesOption59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption64
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption64}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption49
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption59> forSecuritiesOption59 = new MMConstraint<SecuritiesOption59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption64);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption49;
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
	 * {@linkplain com.tools20022.repository.msg.CashOption50 CashOption50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption56
	 * ConstraintIncomeTypeUsageRule.forCashOption56}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption43
	 * ConstraintIncomeTypeUsageRule.forCashOption43}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption50> forCashOption50 = new MMConstraint<CashOption50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption43;
			owner_lazy = () -> CashOption50.mmObject();
		}

		@Override
		public void executeValidator(CashOption50 obj) throws Exception {
			checkCashOption50(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption53 CashOption53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption53> forCashOption53 = new MMConstraint<CashOption53>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61
	 * SecuritiesOption61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption61> forSecuritiesOption61 = new MMConstraint<SecuritiesOption61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63
	 * SecuritiesOption63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption63> forSecuritiesOption63 = new MMConstraint<SecuritiesOption63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption54 CashOption54}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption54> forCashOption54 = new MMConstraint<CashOption54>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption55 CashOption55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption &amp; Income Type Codes\" that is available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption55> forCashOption55 = new MMConstraint<CashOption55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption56 CashOption56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption50
	 * ConstraintIncomeTypeUsageRule.forCashOption50}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption56> forCashOption56 = new MMConstraint<CashOption56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption50;
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
	 * {@linkplain com.tools20022.repository.msg.CashOption57 CashOption57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption51
	 * ConstraintIncomeTypeUsageRule.forCashOption51}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption57> forCashOption57 = new MMConstraint<CashOption57>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption51;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption64
	 * SecuritiesOption64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption59
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption59}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption64> forSecuritiesOption64 = new MMConstraint<SecuritiesOption64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption59;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption65
	 * SecuritiesOption65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption60
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption60}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption65> forSecuritiesOption65 = new MMConstraint<SecuritiesOption65>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption60;
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
	 * {@linkplain com.tools20022.repository.msg.CashOption58 CashOption58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption52
	 * ConstraintIncomeTypeUsageRule.forCashOption52}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption58> forCashOption58 = new MMConstraint<CashOption58>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption52;
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption67
	 * SecuritiesOption67}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption67> forSecuritiesOption67 = new MMConstraint<SecuritiesOption67>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption60 CashOption60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption60> forCashOption60 = new MMConstraint<CashOption60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption68
	 * SecuritiesOption68}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption68> forSecuritiesOption68 = new MMConstraint<SecuritiesOption68>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption61 CashOption61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption61> forCashOption61 = new MMConstraint<CashOption61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption63 CashOption63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeTypeUsageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption &amp; Income Type Codes\" available on the SMPG website at www.smpg.info."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption63> forCashOption63 = new MMConstraint<CashOption63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document \"ETYP-ITYP Exemption & Income Type Codes\" available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption63.mmObject();
		}

		@Override
		public void executeValidator(CashOption63 obj) throws Exception {
			checkCashOption63(obj);
		}
	};

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption44(CashOption44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption49(SecuritiesOption49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption42(CashOption42 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption43(CashOption43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption50(SecuritiesOption50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption46(CashOption46 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption55(SecuritiesOption55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption49(CashOption49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption47(CashOption47 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption57(SecuritiesOption57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption52(CashOption52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption60(SecuritiesOption60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption51(CashOption51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption59(SecuritiesOption59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption50(CashOption50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption53(CashOption53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption61(SecuritiesOption61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption63(SecuritiesOption63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption54(CashOption54 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document titled "ETYP-ITYP Exemption &amp; Income Type Codes" that is
	 * available on the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption55(CashOption55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption56(CashOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption57(CashOption57 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption64(SecuritiesOption64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption65(SecuritiesOption65 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption58(CashOption58 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption67(SecuritiesOption67 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption60(CashOption60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkSecuritiesOption68(SecuritiesOption68 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption61(CashOption61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * The lists of income type codes to be used in IncomeType are provided in
	 * the document "ETYP-ITYP Exemption &amp; Income Type Codes" available on
	 * the SMPG website at www.smpg.info.
	 */
	public static void checkCashOption63(CashOption63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}