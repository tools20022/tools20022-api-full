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
 * TotalUnitsNumber must be the sum of all occurrences of
 * UnitsDetails/UnitsNumber.
 */
public class ConstraintTotalUnitsNumberRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer4 Transfer4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer4> forTransfer4 = new MMConstraint<Transfer4>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer4;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer4.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer7 Transfer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer7> forTransfer7 = new MMConstraint<Transfer7>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer7.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer17 Transfer17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer17> forTransfer17 = new MMConstraint<Transfer17>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer17.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer2 Transfer2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer2> forTransfer2 = new MMConstraint<Transfer2>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer2;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer2.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer10 Transfer10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer10> forTransfer10 = new MMConstraint<Transfer10>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer10.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer14 Transfer14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer14> forTransfer14 = new MMConstraint<Transfer14>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.";
			owner_lazy = () -> Transfer14.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer24 Transfer24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer24> forTransfer24 = new MMConstraint<Transfer24>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.";
			owner_lazy = () -> Transfer24.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer25 Transfer25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer25> forTransfer25 = new MMConstraint<Transfer25>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer25.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer1 Transfer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer1> forTransfer1 = new MMConstraint<Transfer1>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer1;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer1.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer9 Transfer9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer9> forTransfer9 = new MMConstraint<Transfer9>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer9.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer12 Transfer12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer12> forTransfer12 = new MMConstraint<Transfer12>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.";
			owner_lazy = () -> Transfer12.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer20 Transfer20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer20> forTransfer20 = new MMConstraint<Transfer20>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.";
			owner_lazy = () -> Transfer20.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer18 Transfer18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer18> forTransfer18 = new MMConstraint<Transfer18>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer18.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer26 Transfer26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer29
	 * ConstraintTotalUnitsNumberRule.forTransfer29}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer26> forTransfer26 = new MMConstraint<Transfer26>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer29);
			owner_lazy = () -> Transfer26.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer13 Transfer13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer13> forTransfer13 = new MMConstraint<Transfer13>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.";
			owner_lazy = () -> Transfer13.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer23 Transfer23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer28
	 * ConstraintTotalUnitsNumberRule.forTransfer28}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer23> forTransfer23 = new MMConstraint<Transfer23>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer28);
			owner_lazy = () -> Transfer23.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer8 Transfer8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer8> forTransfer8 = new MMConstraint<Transfer8>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber.";
			owner_lazy = () -> Transfer8.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer11 Transfer11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer11> forTransfer11 = new MMConstraint<Transfer11>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.";
			owner_lazy = () -> Transfer11.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer19 Transfer19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer27
	 * ConstraintTotalUnitsNumberRule.forTransfer27}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer19> forTransfer19 = new MMConstraint<Transfer19>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer27);
			owner_lazy = () -> Transfer19.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer27 Transfer27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity/TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer30
	 * ConstraintTotalUnitsNumberRule.forTransfer30}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer19
	 * ConstraintTotalUnitsNumberRule.forTransfer19}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer27> forTransfer27 = new MMConstraint<Transfer27>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "Quantity/TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer30);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer19;
			owner_lazy = () -> Transfer27.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28 Transfer28}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer31
	 * ConstraintTotalUnitsNumberRule.forTransfer31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer23
	 * ConstraintTotalUnitsNumberRule.forTransfer23}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer28> forTransfer28 = new MMConstraint<Transfer28>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer28;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer23;
			owner_lazy = () -> Transfer28.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer29 Transfer29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer33
	 * ConstraintTotalUnitsNumberRule.forTransfer33}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer26
	 * ConstraintTotalUnitsNumberRule.forTransfer26}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer29> forTransfer29 = new MMConstraint<Transfer29>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer33);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer26;
			owner_lazy = () -> Transfer29.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer31 Transfer31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer35
	 * ConstraintTotalUnitsNumberRule.forTransfer35}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer28
	 * ConstraintTotalUnitsNumberRule.forTransfer28}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer31> forTransfer31 = new MMConstraint<Transfer31>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer35);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer28;
			owner_lazy = () -> Transfer31.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30 Transfer30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity/TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer34
	 * ConstraintTotalUnitsNumberRule.forTransfer34}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer27
	 * ConstraintTotalUnitsNumberRule.forTransfer27}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer30> forTransfer30 = new MMConstraint<Transfer30>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer30;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "Quantity/TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer34);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer27;
			owner_lazy = () -> Transfer30.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer33 Transfer33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer29
	 * ConstraintTotalUnitsNumberRule.forTransfer29}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer33> forTransfer33 = new MMConstraint<Transfer33>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer29;
			owner_lazy = () -> Transfer33.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer35 Transfer35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer31
	 * ConstraintTotalUnitsNumberRule.forTransfer31}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer35> forTransfer35 = new MMConstraint<Transfer35>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer31;
			owner_lazy = () -> Transfer35.mmObject();
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer34 Transfer34}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity/TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer30
	 * ConstraintTotalUnitsNumberRule.forTransfer30}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer34> forTransfer34 = new MMConstraint<Transfer34>() {
		{
			validator = ConstraintTotalUnitsNumberRule::checkTransfer34;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumberRule";
			definition = "Quantity/TotalUnitsNumber must be the sum of all occurrences of UnitsDetails/UnitsNumber when UnitsDetails is present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer30;
			owner_lazy = () -> Transfer34.mmObject();
		}
	};

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer4(Transfer4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer7(Transfer7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer17(Transfer17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer2(Transfer2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer10(Transfer10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.
	 */
	public static void checkTransfer14(Transfer14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.
	 */
	public static void checkTransfer24(Transfer24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer25(Transfer25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer1(Transfer1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer9(Transfer9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.
	 */
	public static void checkTransfer12(Transfer12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.
	 */
	public static void checkTransfer20(Transfer20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer18(Transfer18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer26(Transfer26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.
	 */
	public static void checkTransfer13(Transfer13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.
	 */
	public static void checkTransfer23(Transfer23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber.
	 */
	public static void checkTransfer8(Transfer8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.
	 */
	public static void checkTransfer11(Transfer11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber else PortfolioTransferOutRate must be present.
	 */
	public static void checkTransfer19(Transfer19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Quantity/TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer27(Transfer27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer28(Transfer28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer29(Transfer29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer31(Transfer31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Quantity/TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer30(Transfer30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer33(Transfer33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer35(Transfer35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Quantity/TotalUnitsNumber must be the sum of all occurrences of
	 * UnitsDetails/UnitsNumber when UnitsDetails is present.
	 */
	public static void checkTransfer34(Transfer34 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}