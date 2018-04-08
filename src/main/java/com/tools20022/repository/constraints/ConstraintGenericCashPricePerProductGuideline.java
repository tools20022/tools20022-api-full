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
 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
 * prices received or paid in the course of an event. The specific meaning
 * (redemption price, subscription price, reinvestment price, ETC.) is derived
 * from the event type.
 */
public class ConstraintGenericCashPricePerProductGuideline {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22 PriceDetails22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forPriceDetails15
	 * ConstraintGenericCashPricePerProductGuideline.forPriceDetails15}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails22> forPriceDetails22 = new MMConstraint<PriceDetails22>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails15;
			owner_lazy = () -> PriceDetails22.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails22 obj) throws Exception {
			checkPriceDetails22(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption11 CashOption11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption11> forCashOption11 = new MMConstraint<CashOption11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption11.mmObject();
		}

		@Override
		public void executeValidator(CashOption11 obj) throws Exception {
			checkCashOption11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32
	 * CorporateActionPrice32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice32> forCorporateActionPrice32 = new MMConstraint<CorporateActionPrice32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice32.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice32 obj) throws Exception {
			checkCorporateActionPrice32(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56
	 * CorporateActionPrice56}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice43
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice43}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice56> forCorporateActionPrice56 = new MMConstraint<CorporateActionPrice56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice43;
			owner_lazy = () -> CorporateActionPrice56.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice56 obj) throws Exception {
			checkCorporateActionPrice56(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37
	 * CorporateActionPrice37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice37> forCorporateActionPrice37 = new MMConstraint<CorporateActionPrice37>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice37.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice37 obj) throws Exception {
			checkCorporateActionPrice37(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19
	 * CorporateActionPrice19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice19> forCorporateActionPrice19 = new MMConstraint<CorporateActionPrice19>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice19.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice19 obj) throws Exception {
			checkCorporateActionPrice19(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40
	 * CorporateActionPrice40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice40> forCorporateActionPrice40 = new MMConstraint<CorporateActionPrice40>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice40.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice40 obj) throws Exception {
			checkCorporateActionPrice40(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails9 PriceDetails9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails9> forPriceDetails9 = new MMConstraint<PriceDetails9>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails9.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails9 obj) throws Exception {
			checkPriceDetails9(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35
	 * CorporateActionPrice35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice35> forCorporateActionPrice35 = new MMConstraint<CorporateActionPrice35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice35.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice35 obj) throws Exception {
			checkCorporateActionPrice35(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption12 CashOption12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption12> forCashOption12 = new MMConstraint<CashOption12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption12.mmObject();
		}

		@Override
		public void executeValidator(CashOption12 obj) throws Exception {
			checkCashOption12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66
	 * CorporateActionPrice66}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice66> forCorporateActionPrice66 = new MMConstraint<CorporateActionPrice66>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice66.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice66 obj) throws Exception {
			checkCorporateActionPrice66(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64
	 * CorporateActionPrice64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice64> forCorporateActionPrice64 = new MMConstraint<CorporateActionPrice64>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice64.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice64 obj) throws Exception {
			checkCorporateActionPrice64(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33
	 * CorporateActionPrice33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice33> forCorporateActionPrice33 = new MMConstraint<CorporateActionPrice33>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice33.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice33 obj) throws Exception {
			checkCorporateActionPrice33(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11
	 * CorporateActionPrice11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice11> forCorporateActionPrice11 = new MMConstraint<CorporateActionPrice11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice11.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice11 obj) throws Exception {
			checkCorporateActionPrice11(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45
	 * CorporateActionPrice45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice59
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice59}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice39
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice39}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice45> forCorporateActionPrice45 = new MMConstraint<CorporateActionPrice45>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice59);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice39;
			owner_lazy = () -> CorporateActionPrice45.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice45 obj) throws Exception {
			checkCorporateActionPrice45(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52
	 * CorporateActionPrice52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice52> forCorporateActionPrice52 = new MMConstraint<CorporateActionPrice52>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice52.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice52 obj) throws Exception {
			checkCorporateActionPrice52(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38
	 * CorporateActionPrice38}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice43
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice43}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice38> forCorporateActionPrice38 = new MMConstraint<CorporateActionPrice38>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice43);
			owner_lazy = () -> CorporateActionPrice38.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice38 obj) throws Exception {
			checkCorporateActionPrice38(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails18 PriceDetails18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails18> forPriceDetails18 = new MMConstraint<PriceDetails18>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails18.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails18 obj) throws Exception {
			checkPriceDetails18(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26
	 * CorporateActionPrice26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice26> forCorporateActionPrice26 = new MMConstraint<CorporateActionPrice26>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice26.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice26 obj) throws Exception {
			checkCorporateActionPrice26(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20
	 * CorporateActionPrice20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice20> forCorporateActionPrice20 = new MMConstraint<CorporateActionPrice20>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice20.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice20 obj) throws Exception {
			checkCorporateActionPrice20(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62
	 * CorporateActionPrice62}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice62> forCorporateActionPrice62 = new MMConstraint<CorporateActionPrice62>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice62.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice62 obj) throws Exception {
			checkCorporateActionPrice62(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails10 PriceDetails10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forPriceDetails15
	 * ConstraintGenericCashPricePerProductGuideline.forPriceDetails15}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails10> forPriceDetails10 = new MMConstraint<PriceDetails10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails15);
			owner_lazy = () -> PriceDetails10.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails10 obj) throws Exception {
			checkPriceDetails10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55
	 * CorporateActionPrice55}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice55> forCorporateActionPrice55 = new MMConstraint<CorporateActionPrice55>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice55.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice55 obj) throws Exception {
			checkCorporateActionPrice55(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31
	 * CorporateActionPrice31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice31> forCorporateActionPrice31 = new MMConstraint<CorporateActionPrice31>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice31.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice31 obj) throws Exception {
			checkCorporateActionPrice31(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59
	 * CorporateActionPrice59}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice45
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice45}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice59> forCorporateActionPrice59 = new MMConstraint<CorporateActionPrice59>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice45;
			owner_lazy = () -> CorporateActionPrice59.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice59 obj) throws Exception {
			checkCorporateActionPrice59(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7
	 * CorporateActionPrice7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice7> forCorporateActionPrice7 = new MMConstraint<CorporateActionPrice7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice7.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice7 obj) throws Exception {
			checkCorporateActionPrice7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails8 PriceDetails8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails8> forPriceDetails8 = new MMConstraint<PriceDetails8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails8.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails8 obj) throws Exception {
			checkPriceDetails8(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44
	 * CorporateActionPrice44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice60
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice60}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice29
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice29}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice44> forCorporateActionPrice44 = new MMConstraint<CorporateActionPrice44>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice60);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice29;
			owner_lazy = () -> CorporateActionPrice44.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice44 obj) throws Exception {
			checkCorporateActionPrice44(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60
	 * CorporateActionPrice60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice44
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice44}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice60> forCorporateActionPrice60 = new MMConstraint<CorporateActionPrice60>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice44;
			owner_lazy = () -> CorporateActionPrice60.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice60 obj) throws Exception {
			checkCorporateActionPrice60(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption17 CashOption17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption17> forCashOption17 = new MMConstraint<CashOption17>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
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
	 * {@linkplain com.tools20022.repository.msg.CashOption32 CashOption32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption43
	 * ConstraintGenericCashPricePerProductGuideline.forCashOption43}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption24
	 * ConstraintGenericCashPricePerProductGuideline.forCashOption24}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption32> forCashOption32 = new MMConstraint<CashOption32>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption43);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption24;
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
	 * {@linkplain com.tools20022.repository.msg.PriceDetails24 PriceDetails24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails24> forPriceDetails24 = new MMConstraint<PriceDetails24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails24.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails24 obj) throws Exception {
			checkPriceDetails24(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption14 CashOption14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption14> forCashOption14 = new MMConstraint<CashOption14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption14.mmObject();
		}

		@Override
		public void executeValidator(CashOption14 obj) throws Exception {
			checkCashOption14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43
	 * CorporateActionPrice43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice56
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice56}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice38
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice38}</li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice43> forCorporateActionPrice43 = new MMConstraint<CorporateActionPrice43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice38;
			owner_lazy = () -> CorporateActionPrice43.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice43 obj) throws Exception {
			checkCorporateActionPrice43(obj);
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
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price.) is derived from the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption50
	 * ConstraintGenericCashPricePerProductGuideline.forCashOption50}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption56> forCashOption56 = new MMConstraint<CashOption56>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption50;
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
	 * {@linkplain com.tools20022.repository.msg.PriceDetails25 PriceDetails25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails25> forPriceDetails25 = new MMConstraint<PriceDetails25>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails25.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails25 obj) throws Exception {
			checkPriceDetails25(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption24 CashOption24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption32
	 * ConstraintGenericCashPricePerProductGuideline.forCashOption32}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption24> forCashOption24 = new MMConstraint<CashOption24>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption32);
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41
	 * CorporateActionPrice41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice41> forCorporateActionPrice41 = new MMConstraint<CorporateActionPrice41>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice41.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice41 obj) throws Exception {
			checkCorporateActionPrice41(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails14 PriceDetails14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forPriceDetails23
	 * ConstraintGenericCashPricePerProductGuideline.forPriceDetails23}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forPriceDetails11
	 * ConstraintGenericCashPricePerProductGuideline.forPriceDetails11}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails14> forPriceDetails14 = new MMConstraint<PriceDetails14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails11;
			owner_lazy = () -> PriceDetails14.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails14 obj) throws Exception {
			checkPriceDetails14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29
	 * CorporateActionPrice29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice44
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice44}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice29> forCorporateActionPrice29 = new MMConstraint<CorporateActionPrice29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice44);
			owner_lazy = () -> CorporateActionPrice29.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice29 obj) throws Exception {
			checkCorporateActionPrice29(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption10 CashOption10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption10> forCashOption10 = new MMConstraint<CashOption10>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption10.mmObject();
		}

		@Override
		public void executeValidator(CashOption10 obj) throws Exception {
			checkCashOption10(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails12 PriceDetails12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails12> forPriceDetails12 = new MMConstraint<PriceDetails12>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails12.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails12 obj) throws Exception {
			checkPriceDetails12(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51
	 * CorporateActionPrice51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice51> forCorporateActionPrice51 = new MMConstraint<CorporateActionPrice51>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice51.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice51 obj) throws Exception {
			checkCorporateActionPrice51(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption15 CashOption15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption15> forCashOption15 = new MMConstraint<CashOption15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption15.mmObject();
		}

		@Override
		public void executeValidator(CashOption15 obj) throws Exception {
			checkCashOption15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27
	 * CorporateActionPrice27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice27> forCorporateActionPrice27 = new MMConstraint<CorporateActionPrice27>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice27.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice27 obj) throws Exception {
			checkCorporateActionPrice27(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption35 CashOption35}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption35> forCashOption35 = new MMConstraint<CashOption35>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption63> forCashOption63 = new MMConstraint<CashOption63>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price.) is derived from the event type.";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39
	 * CorporateActionPrice39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCorporateActionPrice45
	 * ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice45}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice39> forCorporateActionPrice39 = new MMConstraint<CorporateActionPrice39>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice45);
			owner_lazy = () -> CorporateActionPrice39.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice39 obj) throws Exception {
			checkCorporateActionPrice39(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption21 CashOption21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption21> forCashOption21 = new MMConstraint<CashOption21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption53> forCashOption53 = new MMConstraint<CashOption53>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
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
	 * {@linkplain com.tools20022.repository.msg.PriceDetails21 PriceDetails21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails21> forPriceDetails21 = new MMConstraint<PriceDetails21>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails21.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails21 obj) throws Exception {
			checkPriceDetails21(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails13 PriceDetails13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails13> forPriceDetails13 = new MMConstraint<PriceDetails13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails13.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails13 obj) throws Exception {
			checkPriceDetails13(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23 PriceDetails23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forPriceDetails14
	 * ConstraintGenericCashPricePerProductGuideline.forPriceDetails14}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails23> forPriceDetails23 = new MMConstraint<PriceDetails23>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails14;
			owner_lazy = () -> PriceDetails23.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails23 obj) throws Exception {
			checkPriceDetails23(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14
	 * CorporateActionPrice14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice14> forCorporateActionPrice14 = new MMConstraint<CorporateActionPrice14>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice14.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice14 obj) throws Exception {
			checkCorporateActionPrice14(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails11 PriceDetails11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forPriceDetails14
	 * ConstraintGenericCashPricePerProductGuideline.forPriceDetails14}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails11> forPriceDetails11 = new MMConstraint<PriceDetails11>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails14);
			owner_lazy = () -> PriceDetails11.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails11 obj) throws Exception {
			checkPriceDetails11(obj);
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
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption49> forCashOption49 = new MMConstraint<CashOption49>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption29> forCashOption29 = new MMConstraint<CashOption29>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6
	 * CorporateActionPrice6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice6> forCorporateActionPrice6 = new MMConstraint<CorporateActionPrice6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice6.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice6 obj) throws Exception {
			checkCorporateActionPrice6(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8
	 * CorporateActionPrice8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice8> forCorporateActionPrice8 = new MMConstraint<CorporateActionPrice8>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice8.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice8 obj) throws Exception {
			checkCorporateActionPrice8(obj);
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
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption50
	 * ConstraintGenericCashPricePerProductGuideline.forCashOption50}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption32
	 * ConstraintGenericCashPricePerProductGuideline.forCashOption32}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption43> forCashOption43 = new MMConstraint<CashOption43>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption32;
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
	 * {@linkplain com.tools20022.repository.msg.PriceDetails15 PriceDetails15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forPriceDetails22
	 * ConstraintGenericCashPricePerProductGuideline.forPriceDetails22}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forPriceDetails10
	 * ConstraintGenericCashPricePerProductGuideline.forPriceDetails10}</li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails15> forPriceDetails15 = new MMConstraint<PriceDetails15>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails10;
			owner_lazy = () -> PriceDetails15.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails15 obj) throws Exception {
			checkPriceDetails15(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails7 PriceDetails7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails7> forPriceDetails7 = new MMConstraint<PriceDetails7>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails7.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails7 obj) throws Exception {
			checkPriceDetails7(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.CashOption13 CashOption13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption13> forCashOption13 = new MMConstraint<CashOption13>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption13.mmObject();
		}

		@Override
		public void executeValidator(CashOption13 obj) throws Exception {
			checkCashOption13(obj);
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
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption56
	 * ConstraintGenericCashPricePerProductGuideline.forCashOption56}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption43
	 * ConstraintGenericCashPricePerProductGuideline.forCashOption43}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption50> forCashOption50 = new MMConstraint<CashOption50>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption43;
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5
	 * CorporateActionPrice5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<CorporateActionPrice5> forCorporateActionPrice5 = new MMConstraint<CorporateActionPrice5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice5.mmObject();
		}

		@Override
		public void executeValidator(CorporateActionPrice5 obj) throws Exception {
			checkCorporateActionPrice5(obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceDetails6 PriceDetails6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePerProductGuideline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceDetails6> forPriceDetails6 = new MMConstraint<PriceDetails6>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails6.mmObject();
		}

		@Override
		public void executeValidator(PriceDetails6 obj) throws Exception {
			checkPriceDetails6(obj);
		}
	};

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails22(PriceDetails22 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption11(CashOption11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice32(CorporateActionPrice32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice56(CorporateActionPrice56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice37(CorporateActionPrice37 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice19(CorporateActionPrice19 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice40(CorporateActionPrice40 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails9(PriceDetails9 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice35(CorporateActionPrice35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption12(CashOption12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice66(CorporateActionPrice66 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice64(CorporateActionPrice64 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice33(CorporateActionPrice33 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice11(CorporateActionPrice11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice45(CorporateActionPrice45 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice52(CorporateActionPrice52 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice38(CorporateActionPrice38 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails18(PriceDetails18 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice26(CorporateActionPrice26 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice20(CorporateActionPrice20 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, etc.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice62(CorporateActionPrice62 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails10(PriceDetails10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice55(CorporateActionPrice55 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice31(CorporateActionPrice31 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice59(CorporateActionPrice59 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice7(CorporateActionPrice7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails8(PriceDetails8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice44(CorporateActionPrice44 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, etc.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice60(CorporateActionPrice60 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption17(CashOption17 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption32(CashOption32 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails24(PriceDetails24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption14(CashOption14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice43(CorporateActionPrice43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price.) is derived
	 * from the event type.
	 */
	public static void checkCashOption56(CashOption56 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails25(PriceDetails25 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption24(CashOption24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice41(CorporateActionPrice41 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails14(PriceDetails14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice29(CorporateActionPrice29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption10(CashOption10 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails12(PriceDetails12 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice51(CorporateActionPrice51 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption15(CashOption15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice27(CorporateActionPrice27 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption35(CashOption35 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price.) is derived
	 * from the event type.
	 */
	public static void checkCashOption63(CashOption63 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice39(CorporateActionPrice39 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption21(CashOption21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption53(CashOption53 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails21(PriceDetails21 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails13(PriceDetails13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails23(PriceDetails23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice14(CorporateActionPrice14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails11(PriceDetails11 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption49(CashOption49 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption29(CashOption29 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice6(CorporateActionPrice6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice8(CorporateActionPrice8 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption43(CashOption43 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails15(PriceDetails15 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails7(PriceDetails7 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption13(CashOption13 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCashOption50(CashOption50 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice5(CorporateActionPrice5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails6(PriceDetails6 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}