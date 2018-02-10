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
import com.tools20022.repository.area.seev.*;
import com.tools20022.repository.msg.*;
import java.util.Arrays;

/**
 * If ElectionDetails/OptionType is present, then OptionType is not allowed in
 * any occurrences of
 * ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or
 * ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.
 * 
 * If ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/OptionType
 * is present at least once and/or
 * ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionType is
 * present at least once then ElectionDetails/CorporateActionOptionType is not
 * allowed.
 */
public class ConstraintOptionTypeRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01
	 * AgentCAElectionAdviceV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ElectionDetails/OptionType is present, then OptionType is not allowed in any occurrences of ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.\n\nIf ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/OptionType is present at least once and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionType is present at least once then ElectionDetails/CorporateActionOptionType is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<AgentCAElectionAdviceV01> forAgentCAElectionAdviceV01 = new MMConstraint<AgentCAElectionAdviceV01>() {
		{
			validator = ConstraintOptionTypeRule::checkAgentCAElectionAdviceV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If ElectionDetails/OptionType is present, then OptionType is not allowed in any occurrences of ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.\n\nIf ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/OptionType is present at least once and/or ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionType is present at least once then ElectionDetails/CorporateActionOptionType is not allowed.";
			owner_lazy = () -> AgentCAElectionAdviceV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV08
	 * CorporateActionInstructionV08}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#forCorporateActionInstructionV07
	 * ConstraintOptionTypeRule.forCorporateActionInstructionV07}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV08> forCorporateActionInstructionV08 = new MMConstraint<CorporateActionInstructionV08>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionInstructionV08;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionTypeRule.forCorporateActionInstructionV07;
			owner_lazy = () -> CorporateActionInstructionV08.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV07
	 * CorporateActionInstructionV07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#forCorporateActionInstructionV08
	 * ConstraintOptionTypeRule.forCorporateActionInstructionV08}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#forCorporateActionInstructionV06
	 * ConstraintOptionTypeRule.forCorporateActionInstructionV06}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV07> forCorporateActionInstructionV07 = new MMConstraint<CorporateActionInstructionV07>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionInstructionV07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionTypeRule.forCorporateActionInstructionV08);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionTypeRule.forCorporateActionInstructionV06;
			owner_lazy = () -> CorporateActionInstructionV07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstruction002V07
	 * CorporateActionInstruction002V07}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstruction002V07> forCorporateActionInstruction002V07 = new MMConstraint<CorporateActionInstruction002V07>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionInstruction002V07;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present.";
			owner_lazy = () -> CorporateActionInstruction002V07.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV01
	 * CorporateActionInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV01> forCorporateActionInstructionV01 = new MMConstraint<CorporateActionInstructionV01>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionInstructionV01;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present.";
			owner_lazy = () -> CorporateActionInstructionV01.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV02
	 * CorporateActionInstructionV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV02> forCorporateActionInstructionV02 = new MMConstraint<CorporateActionInstructionV02>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionInstructionV02;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present.";
			owner_lazy = () -> CorporateActionInstructionV02.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV03
	 * CorporateActionInstructionV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV03> forCorporateActionInstructionV03 = new MMConstraint<CorporateActionInstructionV03>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionInstructionV03;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present.";
			owner_lazy = () -> CorporateActionInstructionV03.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV04
	 * CorporateActionInstructionV04}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#forCorporateActionInstructionV05
	 * ConstraintOptionTypeRule.forCorporateActionInstructionV05}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV04> forCorporateActionInstructionV04 = new MMConstraint<CorporateActionInstructionV04>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionInstructionV04;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionTypeRule.forCorporateActionInstructionV05);
			owner_lazy = () -> CorporateActionInstructionV04.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV05
	 * CorporateActionInstructionV05}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#forCorporateActionInstructionV06
	 * ConstraintOptionTypeRule.forCorporateActionInstructionV06}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#forCorporateActionInstructionV04
	 * ConstraintOptionTypeRule.forCorporateActionInstructionV04}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV05> forCorporateActionInstructionV05 = new MMConstraint<CorporateActionInstructionV05>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionInstructionV05;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI, then at least one occurrence of BeneficialOwnerDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionTypeRule.forCorporateActionInstructionV06);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionTypeRule.forCorporateActionInstructionV04;
			owner_lazy = () -> CorporateActionInstructionV05.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.seev.CorporateActionInstructionV06
	 * CorporateActionInstructionV06}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#forCorporateActionInstructionV07
	 * ConstraintOptionTypeRule.forCorporateActionInstructionV07}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionTypeRule#forCorporateActionInstructionV05
	 * ConstraintOptionTypeRule.forCorporateActionInstructionV05}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionInstructionV06> forCorporateActionInstructionV06 = new MMConstraint<CorporateActionInstructionV06>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionInstructionV06;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If CorporateActionInstruction/OptionType/Code value is TAXI (Tax Instruction), then at least one occurrence of BeneficialOwnerDetails must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionTypeRule.forCorporateActionInstructionV07);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintOptionTypeRule.forCorporateActionInstructionV05;
			owner_lazy = () -> CorporateActionInstructionV06.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption6
	 * CorporateActionOption6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption6> forCorporateActionOption6 = new MMConstraint<CorporateActionOption6>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption6.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9
	 * CorporateActionOption9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption9> forCorporateActionOption9 = new MMConstraint<CorporateActionOption9>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18
	 * CorporateActionOption18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption18> forCorporateActionOption18 = new MMConstraint<CorporateActionOption18>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption4
	 * CorporateActionOption4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption4> forCorporateActionOption4 = new MMConstraint<CorporateActionOption4>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption14
	 * CorporateActionOption14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption14> forCorporateActionOption14 = new MMConstraint<CorporateActionOption14>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption10
	 * CorporateActionOption10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption10> forCorporateActionOption10 = new MMConstraint<CorporateActionOption10>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption15
	 * CorporateActionOption15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption15> forCorporateActionOption15 = new MMConstraint<CorporateActionOption15>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption15.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption12
	 * CorporateActionOption12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption12> forCorporateActionOption12 = new MMConstraint<CorporateActionOption12>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption16
	 * CorporateActionOption16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption16> forCorporateActionOption16 = new MMConstraint<CorporateActionOption16>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption16;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption16.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption3
	 * CorporateActionOption3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption3> forCorporateActionOption3 = new MMConstraint<CorporateActionOption3>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption3;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption3.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption17
	 * CorporateActionOption17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption17> forCorporateActionOption17 = new MMConstraint<CorporateActionOption17>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionOption7
	 * CorporateActionOption7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionOption7> forCorporateActionOption7 = new MMConstraint<CorporateActionOption7>() {
		{
			validator = ConstraintOptionTypeRule::checkCorporateActionOption7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionTypeRule";
			definition = "If for an exercise of warrants or an exercise of rights, the proceeds are known, the more precise OptionType/Code values like CASH, SECU, CASE or NOAC must be used. \r\nIf the proceeds are at issuer choice, ie, the proceeds are not known upfront, then OptionType/Code EXER must be used.";
			owner_lazy = () -> CorporateActionOption7.mmObject();
		}
	};

	/**
	 * If ElectionDetails/OptionType is present, then OptionType is not allowed
	 * in any occurrences of
	 * ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails and/or
	 * ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails.
	 * 
	 * If ElectionDetails/SecuritiesMovementDetails/DebitAccountDetails/
	 * OptionType is present at least once and/or
	 * ElectionDetails/SecuritiesMovementDetails/CreditAccountDetails/OptionType
	 * is present at least once then ElectionDetails/CorporateActionOptionType
	 * is not allowed.
	 */
	public static void checkAgentCAElectionAdviceV01(AgentCAElectionAdviceV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI (Tax
	 * Instruction), then at least one occurrence of BeneficialOwnerDetails must
	 * be present.
	 */
	public static void checkCorporateActionInstructionV08(CorporateActionInstructionV08 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI (Tax
	 * Instruction), then at least one occurrence of BeneficialOwnerDetails must
	 * be present.
	 */
	public static void checkCorporateActionInstructionV07(CorporateActionInstructionV07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI (Tax
	 * Instruction), then at least one occurrence of BeneficialOwnerDetails must
	 * be present.
	 */
	public static void checkCorporateActionInstruction002V07(CorporateActionInstruction002V07 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI, then at
	 * least one occurrence of BeneficialOwnerDetails must be present.
	 */
	public static void checkCorporateActionInstructionV01(CorporateActionInstructionV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI, then at
	 * least one occurrence of BeneficialOwnerDetails must be present.
	 */
	public static void checkCorporateActionInstructionV02(CorporateActionInstructionV02 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI, then at
	 * least one occurrence of BeneficialOwnerDetails must be present.
	 */
	public static void checkCorporateActionInstructionV03(CorporateActionInstructionV03 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI, then at
	 * least one occurrence of BeneficialOwnerDetails must be present.
	 */
	public static void checkCorporateActionInstructionV04(CorporateActionInstructionV04 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI, then at
	 * least one occurrence of BeneficialOwnerDetails must be present.
	 */
	public static void checkCorporateActionInstructionV05(CorporateActionInstructionV05 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If CorporateActionInstruction/OptionType/Code value is TAXI (Tax
	 * Instruction), then at least one occurrence of BeneficialOwnerDetails must
	 * be present.
	 */
	public static void checkCorporateActionInstructionV06(CorporateActionInstructionV06 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption6(CorporateActionOption6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption9(CorporateActionOption9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption18(CorporateActionOption18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption4(CorporateActionOption4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption14(CorporateActionOption14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption10(CorporateActionOption10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption15(CorporateActionOption15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption12(CorporateActionOption12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption16(CorporateActionOption16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption3(CorporateActionOption3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption17(CorporateActionOption17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If for an exercise of warrants or an exercise of rights, the proceeds are
	 * known, the more precise OptionType/Code values like CASH, SECU, CASE or
	 * NOAC must be used. <br>
	 * If the proceeds are at issuer choice, ie, the proceeds are not known
	 * upfront, then OptionType/Code EXER must be used.
	 */
	public static void checkCorporateActionOption7(CorporateActionOption7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}