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
 * GenericCashPriceReceivedPerProduct is the price received in the course of an
 * event. The specific meaning (redemption price, subscription price,
 * reinvestment price, ETC.) is derived from the event type.
 */
public class ConstraintGenericCashPriceReceivedPerProductGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21
	 * CorporateActionPrice21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice21> forCorporateActionPrice21 = new MMConstraint<CorporateActionPrice21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice21.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice21 obj) throws Exception {
			checkCorporateActionPrice21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22
	 * CorporateActionPrice22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice22> forCorporateActionPrice22 = new MMConstraint<CorporateActionPrice22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice22.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice22 obj) throws Exception {
			checkCorporateActionPrice22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice30
	 * CorporateActionPrice30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPriceReceivedPerProductGuideline#forCorporateActionPrice61
	 * ConstraintGenericCashPriceReceivedPerProductGuideline.
	 * forCorporateActionPrice61}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice30> forCorporateActionPrice30 = new MMConstraint<CorporateActionPrice30>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPriceReceivedPerProductGuideline.forCorporateActionPrice61);
			owner_lazy = () -> CorporateActionPrice30.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice30 obj) throws Exception {
			checkCorporateActionPrice30(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice36
	 * CorporateActionPrice36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice36> forCorporateActionPrice36 = new MMConstraint<CorporateActionPrice36>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice36.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice36 obj) throws Exception {
			checkCorporateActionPrice36(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16
	 * CorporateActionPrice16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice16> forCorporateActionPrice16 = new MMConstraint<CorporateActionPrice16>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice16.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice16 obj) throws Exception {
			checkCorporateActionPrice16(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23
	 * CorporateActionPrice23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice23> forCorporateActionPrice23 = new MMConstraint<CorporateActionPrice23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice23.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice23 obj) throws Exception {
			checkCorporateActionPrice23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61
	 * CorporateActionPrice61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPriceReceivedPerProductGuideline#forCorporateActionPrice30
	 * ConstraintGenericCashPriceReceivedPerProductGuideline.
	 * forCorporateActionPrice30}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice61> forCorporateActionPrice61 = new MMConstraint<CorporateActionPrice61>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPriceReceivedPerProductGuideline.forCorporateActionPrice30;
			owner_lazy = () -> CorporateActionPrice61.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice61 obj) throws Exception {
			checkCorporateActionPrice61(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice63
	 * CorporateActionPrice63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice63> forCorporateActionPrice63 = new MMConstraint<CorporateActionPrice63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPriceReceivedPerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct is the price received in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice63.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice63 obj) throws Exception {
			checkCorporateActionPrice63(obj);
		}
	};

	/**
	 * GenericCashPriceReceivedPerProduct is the price received in the course of
	 * an event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice21(CorporateActionPrice21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct is the price received in the course of
	 * an event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice22(CorporateActionPrice22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct is the price received in the course of
	 * an event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice30(CorporateActionPrice30 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct is the price received in the course of
	 * an event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice36(CorporateActionPrice36 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct is the price received in the course of
	 * an event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice16(CorporateActionPrice16 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct is the price received in the course of
	 * an event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice23(CorporateActionPrice23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct is the price received in the course of
	 * an event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice61(CorporateActionPrice61 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct is the price received in the course of
	 * an event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice63(CorporateActionPrice63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}