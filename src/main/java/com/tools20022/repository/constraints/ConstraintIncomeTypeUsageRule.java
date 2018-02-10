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
			validator = ConstraintIncomeTypeUsageRule::checkCashOption44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption52);
			owner_lazy = () -> CashOption44.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkSecuritiesOption49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption59);
			owner_lazy = () -> SecuritiesOption49.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkCashOption42;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption51);
			owner_lazy = () -> CashOption42.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkCashOption43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption50);
			owner_lazy = () -> CashOption43.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkSecuritiesOption50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption60);
			owner_lazy = () -> SecuritiesOption50.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkCashOption46;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption46.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkSecuritiesOption55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption55.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkCashOption49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption49.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkCashOption47;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption47.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkSecuritiesOption57;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption57.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption44
	 * ConstraintIncomeTypeUsageRule.forCashOption44}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption52> forCashOption52 = new MMConstraint<CashOption52>() {
		{
			validator = ConstraintIncomeTypeUsageRule::checkCashOption52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption44;
			owner_lazy = () -> CashOption52.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption50
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption50}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption60> forSecuritiesOption60 = new MMConstraint<SecuritiesOption60>() {
		{
			validator = ConstraintIncomeTypeUsageRule::checkSecuritiesOption60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption50;
			owner_lazy = () -> SecuritiesOption60.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption42
	 * ConstraintIncomeTypeUsageRule.forCashOption42}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption51> forCashOption51 = new MMConstraint<CashOption51>() {
		{
			validator = ConstraintIncomeTypeUsageRule::checkCashOption51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption42;
			owner_lazy = () -> CashOption51.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forSecuritiesOption49
	 * ConstraintIncomeTypeUsageRule.forSecuritiesOption49}</li>
	 * </ul>
	 */
	public static final MMConstraint<SecuritiesOption59> forSecuritiesOption59 = new MMConstraint<SecuritiesOption59>() {
		{
			validator = ConstraintIncomeTypeUsageRule::checkSecuritiesOption59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forSecuritiesOption49;
			owner_lazy = () -> SecuritiesOption59.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule#forCashOption43
	 * ConstraintIncomeTypeUsageRule.forCashOption43}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption50> forCashOption50 = new MMConstraint<CashOption50>() {
		{
			validator = ConstraintIncomeTypeUsageRule::checkCashOption50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintIncomeTypeUsageRule.forCashOption43;
			owner_lazy = () -> CashOption50.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkCashOption53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption53.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkSecuritiesOption61;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption61.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkSecuritiesOption63;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> SecuritiesOption63.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkCashOption54;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption54.mmObject();
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
			validator = ConstraintIncomeTypeUsageRule::checkCashOption55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeTypeUsageRule";
			definition = "The lists of income type codes to be used in IncomeType are provided in the document titled \"ETYP-ITYP Exemption & Income Type Codes\" that is available on the SMPG website at www.smpg.info.";
			owner_lazy = () -> CashOption55.mmObject();
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
}