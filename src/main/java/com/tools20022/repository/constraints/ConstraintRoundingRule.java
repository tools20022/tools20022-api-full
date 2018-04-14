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
 * Rounding may only be present if PortfolioTransferOutRate is present.
 */
public class ConstraintRoundingRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28 Transfer28}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding may only be present if PortfolioTransferOutRate is present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRoundingRule#forTransfer31
	 * ConstraintRoundingRule.forTransfer31}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRoundingRule#forTransfer23
	 * ConstraintRoundingRule.forTransfer23}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer28> forTransfer28 = new MMConstraint<Transfer28>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingRule";
			definition = "Rounding may only be present if PortfolioTransferOutRate is present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRoundingRule.forTransfer31);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRoundingRule.forTransfer23;
			owner_lazy = () -> Transfer28.mmObject();
		}

		@Override
		public void executeValidator(Transfer28 obj) throws Exception {
			checkTransfer28(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer31 Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding may only be present if PortfolioTransferOutRate is present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRoundingRule#forTransfer28
	 * ConstraintRoundingRule.forTransfer28}</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer31> forTransfer31 = new MMConstraint<Transfer31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingRule";
			definition = "Rounding may only be present if PortfolioTransferOutRate is present.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintRoundingRule.forTransfer28;
			owner_lazy = () -> Transfer31.mmObject();
		}

		@Override
		public void executeValidator(Transfer31 obj) throws Exception {
			checkTransfer31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer23 Transfer23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding may only be present if PortfolioTransferOutRate is present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintRoundingRule#forTransfer28
	 * ConstraintRoundingRule.forTransfer28}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer23> forTransfer23 = new MMConstraint<Transfer23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingRule";
			definition = "Rounding may only be present if PortfolioTransferOutRate is present.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRoundingRule.forTransfer28);
			owner_lazy = () -> Transfer23.mmObject();
		}

		@Override
		public void executeValidator(Transfer23 obj) throws Exception {
			checkTransfer23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer24 Transfer24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding may only be present if PortfolioTransferOutRate is present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer24> forTransfer24 = new MMConstraint<Transfer24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingRule";
			definition = "Rounding may only be present if PortfolioTransferOutRate is present.";
			owner_lazy = () -> Transfer24.mmObject();
		}

		@Override
		public void executeValidator(Transfer24 obj) throws Exception {
			checkTransfer24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer14 Transfer14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding may only be present if PortfolioTransferOutRate is present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer14> forTransfer14 = new MMConstraint<Transfer14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingRule";
			definition = "Rounding may only be present if PortfolioTransferOutRate is present.";
			owner_lazy = () -> Transfer14.mmObject();
		}

		@Override
		public void executeValidator(Transfer14 obj) throws Exception {
			checkTransfer14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer13 Transfer13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding may only be present if PortfolioTransferOutRate is present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer13> forTransfer13 = new MMConstraint<Transfer13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingRule";
			definition = "Rounding may only be present if PortfolioTransferOutRate is present.";
			owner_lazy = () -> Transfer13.mmObject();
		}

		@Override
		public void executeValidator(Transfer13 obj) throws Exception {
			checkTransfer13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Transfer10 Transfer10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding may only be present if PortfolioTransferOutRate is present."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Transfer10> forTransfer10 = new MMConstraint<Transfer10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingRule";
			definition = "Rounding may only be present if PortfolioTransferOutRate is present.";
			owner_lazy = () -> Transfer10.mmObject();
		}

		@Override
		public void executeValidator(Transfer10 obj) throws Exception {
			checkTransfer10(obj);
		}
	};

	/**
	 * Rounding may only be present if PortfolioTransferOutRate is present.
	 */
	public static void checkTransfer28(Transfer28 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Rounding may only be present if PortfolioTransferOutRate is present.
	 */
	public static void checkTransfer31(Transfer31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Rounding may only be present if PortfolioTransferOutRate is present.
	 */
	public static void checkTransfer23(Transfer23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Rounding may only be present if PortfolioTransferOutRate is present.
	 */
	public static void checkTransfer24(Transfer24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Rounding may only be present if PortfolioTransferOutRate is present.
	 */
	public static void checkTransfer14(Transfer14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Rounding may only be present if PortfolioTransferOutRate is present.
	 */
	public static void checkTransfer13(Transfer13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Rounding may only be present if PortfolioTransferOutRate is present.
	 */
	public static void checkTransfer10(Transfer10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}