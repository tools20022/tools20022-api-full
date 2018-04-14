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
import com.tools20022.repository.msg.Baseline2;
import com.tools20022.repository.msg.Baseline3;
import com.tools20022.repository.msg.Baseline4;
import com.tools20022.repository.msg.Baseline5;
import java.util.Arrays;

/**
 * If TransportDataSetRequired is present, then Goods/TransShipment is
 * mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is
 * optional.
 */
public class ConstraintTransShipmentRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Baseline5 Baseline5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipmentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TransportDataSetRequired is present, then Goods/TransShipment is mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransShipmentRule#forBaseline4
	 * ConstraintTransShipmentRule.forBaseline4}</li>
	 * </ul>
	 */
	public static final MMConstraint<Baseline5> forBaseline5 = new MMConstraint<Baseline5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransShipmentRule";
			definition = "If TransportDataSetRequired is present, then Goods/TransShipment is mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is optional.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransShipmentRule.forBaseline4;
			owner_lazy = () -> Baseline5.mmObject();
		}

		@Override
		public void executeValidator(Baseline5 obj) throws Exception {
			checkBaseline5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Baseline3 Baseline3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipmentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TransportDataSetRequired is present, then Goods/TransShipment is mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransShipmentRule#forBaseline4
	 * ConstraintTransShipmentRule.forBaseline4}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<Baseline3> forBaseline3 = new MMConstraint<Baseline3>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransShipmentRule";
			definition = "If TransportDataSetRequired is present, then Goods/TransShipment is mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransShipmentRule.forBaseline4);
			owner_lazy = () -> Baseline3.mmObject();
		}

		@Override
		public void executeValidator(Baseline3 obj) throws Exception {
			checkBaseline3(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Baseline4 Baseline4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipmentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If TransportDataSetRequired is present, then Goods/TransShipment is mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransShipmentRule#forBaseline5
	 * ConstraintTransShipmentRule.forBaseline5}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintTransShipmentRule#forBaseline3
	 * ConstraintTransShipmentRule.forBaseline3}</li>
	 * </ul>
	 */
	public static final MMConstraint<Baseline4> forBaseline4 = new MMConstraint<Baseline4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransShipmentRule";
			definition = "If TransportDataSetRequired is present, then Goods/TransShipment is mandatory. If TransportDataSetRequired is absent, then Goods/TransShipment is optional.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransShipmentRule.forBaseline5);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintTransShipmentRule.forBaseline3;
			owner_lazy = () -> Baseline4.mmObject();
		}

		@Override
		public void executeValidator(Baseline4 obj) throws Exception {
			checkBaseline4(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Baseline2 Baseline2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipmentRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If DataSetRequired/RequiredTransportDataSet is TRUE, then Goods/TransShipment is mandatory. If DataSetRequired/RequiredTransportDataSet is FALSE, then Goods/TransShipment is optional."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMConstraint<Baseline2> forBaseline2 = new MMConstraint<Baseline2>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransShipmentRule";
			definition = "If DataSetRequired/RequiredTransportDataSet is TRUE, then Goods/TransShipment is mandatory. If DataSetRequired/RequiredTransportDataSet is FALSE, then Goods/TransShipment is optional.";
			owner_lazy = () -> Baseline2.mmObject();
		}

		@Override
		public void executeValidator(Baseline2 obj) throws Exception {
			checkBaseline2(obj);
		}
	};

	/**
	 * If TransportDataSetRequired is present, then Goods/TransShipment is
	 * mandatory. If TransportDataSetRequired is absent, then
	 * Goods/TransShipment is optional.
	 */
	public static void checkBaseline5(Baseline5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TransportDataSetRequired is present, then Goods/TransShipment is
	 * mandatory. If TransportDataSetRequired is absent, then
	 * Goods/TransShipment is optional.
	 */
	public static void checkBaseline3(Baseline3 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If TransportDataSetRequired is present, then Goods/TransShipment is
	 * mandatory. If TransportDataSetRequired is absent, then
	 * Goods/TransShipment is optional.
	 */
	public static void checkBaseline4(Baseline4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If DataSetRequired/RequiredTransportDataSet is TRUE, then
	 * Goods/TransShipment is mandatory. If
	 * DataSetRequired/RequiredTransportDataSet is FALSE, then
	 * Goods/TransShipment is optional.
	 */
	public static void checkBaseline2(Baseline2 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}