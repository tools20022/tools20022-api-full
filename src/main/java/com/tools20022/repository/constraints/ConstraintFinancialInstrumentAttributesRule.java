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
 * If InvestmentFundsFinancialInstrumentAttributes is present, then
 * FinancialInstrumentAttributes is not allowed.
 */
public class ConstraintFinancialInstrumentAttributesRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8
	 * AggregateBalanceInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation8> forAggregateBalanceInformation8 = new MMConstraint<AggregateBalanceInformation8>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11
	 * AggregateBalanceInformation11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation11> forAggregateBalanceInformation11 = new MMConstraint<AggregateBalanceInformation11>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13
	 * AggregateBalanceInformation13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation13> forAggregateBalanceInformation13 = new MMConstraint<AggregateBalanceInformation13>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15
	 * AggregateBalanceInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation15> forAggregateBalanceInformation15 = new MMConstraint<AggregateBalanceInformation15>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17
	 * AggregateBalanceInformation17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation17> forAggregateBalanceInformation17 = new MMConstraint<AggregateBalanceInformation17>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19
	 * AggregateBalanceInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation19> forAggregateBalanceInformation19 = new MMConstraint<AggregateBalanceInformation19>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22
	 * AggregateBalanceInformation22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule#forAggregateBalanceInformation26
	 * ConstraintFinancialInstrumentAttributesRule.
	 * forAggregateBalanceInformation26}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation22> forAggregateBalanceInformation22 = new MMConstraint<AggregateBalanceInformation22>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation26);
			owner_lazy = () -> AggregateBalanceInformation22.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23
	 * AggregateBalanceInformation23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation23> forAggregateBalanceInformation23 = new MMConstraint<AggregateBalanceInformation23>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9
	 * AggregateBalanceInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation9> forAggregateBalanceInformation9 = new MMConstraint<AggregateBalanceInformation9>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10
	 * AggregateBalanceInformation10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation10> forAggregateBalanceInformation10 = new MMConstraint<AggregateBalanceInformation10>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12
	 * AggregateBalanceInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation12> forAggregateBalanceInformation12 = new MMConstraint<AggregateBalanceInformation12>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14
	 * AggregateBalanceInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation14> forAggregateBalanceInformation14 = new MMConstraint<AggregateBalanceInformation14>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16
	 * AggregateBalanceInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation16> forAggregateBalanceInformation16 = new MMConstraint<AggregateBalanceInformation16>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18
	 * AggregateBalanceInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation18> forAggregateBalanceInformation18 = new MMConstraint<AggregateBalanceInformation18>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21
	 * AggregateBalanceInformation21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule#forAggregateBalanceInformation25
	 * ConstraintFinancialInstrumentAttributesRule.
	 * forAggregateBalanceInformation25}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation21> forAggregateBalanceInformation21 = new MMConstraint<AggregateBalanceInformation21>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation25);
			owner_lazy = () -> AggregateBalanceInformation21.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24
	 * AggregateBalanceInformation24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation24> forAggregateBalanceInformation24 = new MMConstraint<AggregateBalanceInformation24>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20
	 * AggregateBalanceInformation20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation20> forAggregateBalanceInformation20 = new MMConstraint<AggregateBalanceInformation20>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26
	 * AggregateBalanceInformation26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule#forAggregateBalanceInformation31
	 * ConstraintFinancialInstrumentAttributesRule.
	 * forAggregateBalanceInformation31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule#forAggregateBalanceInformation22
	 * ConstraintFinancialInstrumentAttributesRule.
	 * forAggregateBalanceInformation22}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation26> forAggregateBalanceInformation26 = new MMConstraint<AggregateBalanceInformation26>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation22;
			owner_lazy = () -> AggregateBalanceInformation26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25
	 * AggregateBalanceInformation25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule#forAggregateBalanceInformation30
	 * ConstraintFinancialInstrumentAttributesRule.
	 * forAggregateBalanceInformation30}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule#forAggregateBalanceInformation21
	 * ConstraintFinancialInstrumentAttributesRule.
	 * forAggregateBalanceInformation21}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation25> forAggregateBalanceInformation25 = new MMConstraint<AggregateBalanceInformation25>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation30);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation21;
			owner_lazy = () -> AggregateBalanceInformation25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28
	 * AggregateBalanceInformation28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation28> forAggregateBalanceInformation28 = new MMConstraint<AggregateBalanceInformation28>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27
	 * AggregateBalanceInformation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation27> forAggregateBalanceInformation27 = new MMConstraint<AggregateBalanceInformation27>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30
	 * AggregateBalanceInformation30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule#forAggregateBalanceInformation25
	 * ConstraintFinancialInstrumentAttributesRule.
	 * forAggregateBalanceInformation25}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation30> forAggregateBalanceInformation30 = new MMConstraint<AggregateBalanceInformation30>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation25;
			owner_lazy = () -> AggregateBalanceInformation30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31
	 * AggregateBalanceInformation31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule#forAggregateBalanceInformation26
	 * ConstraintFinancialInstrumentAttributesRule.
	 * forAggregateBalanceInformation26}</li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation31> forAggregateBalanceInformation31 = new MMConstraint<AggregateBalanceInformation31>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintFinancialInstrumentAttributesRule.forAggregateBalanceInformation26;
			owner_lazy = () -> AggregateBalanceInformation31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32
	 * AggregateBalanceInformation32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation32> forAggregateBalanceInformation32 = new MMConstraint<AggregateBalanceInformation32>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation32.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33
	 * AggregateBalanceInformation33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributesRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AggregateBalanceInformation33> forAggregateBalanceInformation33 = new MMConstraint<AggregateBalanceInformation33>() {
		{
			validator = ConstraintFinancialInstrumentAttributesRule::checkAggregateBalanceInformation33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributesRule";
			definition = "If InvestmentFundsFinancialInstrumentAttributes is present, then FinancialInstrumentAttributes is not allowed.";
			owner_lazy = () -> AggregateBalanceInformation33.mmObject();
		}
	};

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation8(AggregateBalanceInformation8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation11(AggregateBalanceInformation11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation13(AggregateBalanceInformation13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation15(AggregateBalanceInformation15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation17(AggregateBalanceInformation17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation19(AggregateBalanceInformation19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation22(AggregateBalanceInformation22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation23(AggregateBalanceInformation23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation9(AggregateBalanceInformation9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation10(AggregateBalanceInformation10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation12(AggregateBalanceInformation12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation14(AggregateBalanceInformation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation16(AggregateBalanceInformation16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation18(AggregateBalanceInformation18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation21(AggregateBalanceInformation21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation24(AggregateBalanceInformation24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation20(AggregateBalanceInformation20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation26(AggregateBalanceInformation26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation25(AggregateBalanceInformation25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation28(AggregateBalanceInformation28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation27(AggregateBalanceInformation27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation30(AggregateBalanceInformation30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation31(AggregateBalanceInformation31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation32(AggregateBalanceInformation32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If InvestmentFundsFinancialInstrumentAttributes is present, then
	 * FinancialInstrumentAttributes is not allowed.
	 */
	public static void checkAggregateBalanceInformation33(AggregateBalanceInformation33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}