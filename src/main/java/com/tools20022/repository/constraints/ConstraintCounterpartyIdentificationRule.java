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
import com.tools20022.repository.area.camt.NetReportV01;
import com.tools20022.repository.msg.NetObligation1;

/**
 * NetServiceCounterpartyIdentification must only be used at this level if all
 * of the underlying obligations are with a single counterparty.
 */
public class ConstraintCounterpartyIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.area.camt.NetReportV01
	 * NetReportV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "NetServiceCounterpartyIdentification must only be used at this level if all of the underlying obligations are with a single counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetReportV01> for_camt_NetReportV01 = new MMConstraint<NetReportV01>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentificationRule";
			definition = "NetServiceCounterpartyIdentification must only be used at this level if all of the underlying obligations are with a single counterparty.";
			owner_lazy = () -> NetReportV01.mmObject();
		}

		@Override
		public void executeValidator(NetReportV01 obj) throws Exception {
			check_camt_NetReportV01(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "NetServiceCounterpartyIdentification must be present at this level in all obligations if one or more counterparties are involved in the calculation of the net report, i.e.NetServiceCounterpartyIdentification is not used in NetReport level."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<NetObligation1> forNetObligation1 = new MMConstraint<NetObligation1>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentificationRule";
			definition = "NetServiceCounterpartyIdentification must be present at this level in all obligations if one or more counterparties are involved in the calculation of the net report, i.e.NetServiceCounterpartyIdentification is not used in NetReport level.";
			owner_lazy = () -> NetObligation1.mmObject();
		}

		@Override
		public void executeValidator(NetObligation1 obj) throws Exception {
			checkNetObligation1(obj);
		}
	};

	/**
	 * NetServiceCounterpartyIdentification must only be used at this level if
	 * all of the underlying obligations are with a single counterparty.
	 */
	public static void check_camt_NetReportV01(NetReportV01 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * NetServiceCounterpartyIdentification must be present at this level in all
	 * obligations if one or more counterparties are involved in the calculation
	 * of the net report, i.e.NetServiceCounterpartyIdentification is not used
	 * in NetReport level.
	 */
	public static void checkNetObligation1(NetObligation1 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}