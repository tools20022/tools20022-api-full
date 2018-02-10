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
 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid
 * per Product (PRPP) are prices received or paid in the course of an event. The
 * specific meaning (redemption price, subscription price, reinvestment price,
 * ETC.) is derived from the event type.
 */
public class ConstraintGenericCashPricePerProductGuideline {

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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice8.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice11.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice19;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice19.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice20;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice20.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice44);
			owner_lazy = () -> CorporateActionPrice29.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice35.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice5;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice5.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice7.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption12.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption13.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice27;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice27.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails7;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails7.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice33;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice33.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails9;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails9.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice39;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice45);
			owner_lazy = () -> CorporateActionPrice39.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails14);
			owner_lazy = () -> PriceDetails11.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice40;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice40.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails12;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails12.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice6.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice14.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption11;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption11.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption14.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice26;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice26.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails6;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails6.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice32.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails8;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails8.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice38;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice43);
			owner_lazy = () -> CorporateActionPrice38.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails15);
			owner_lazy = () -> PriceDetails10.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice41;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice41.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails13;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails13.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption10;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption10.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption15.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice31;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice31.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption17;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption17.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice37;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice37.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption21.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption32);
			owner_lazy = () -> CashOption24.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption29;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption29.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails14;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails23);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails11;
			owner_lazy = () -> PriceDetails14.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice56);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice38;
			owner_lazy = () -> CorporateActionPrice43.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice44;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice60);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice29;
			owner_lazy = () -> CorporateActionPrice44.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice45;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice59);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice39;
			owner_lazy = () -> CorporateActionPrice45.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails15;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails22);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails10;
			owner_lazy = () -> PriceDetails15.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption32;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption43);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption24;
			owner_lazy = () -> CashOption32.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption35;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption35.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails18;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails18.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails21;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails21.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice52;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice52.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice55;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice55.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice51;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice51.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice59;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice45;
			owner_lazy = () -> CorporateActionPrice59.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails23;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails14;
			owner_lazy = () -> PriceDetails23.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice56;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice43;
			owner_lazy = () -> CorporateActionPrice56.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice60;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCorporateActionPrice44;
			owner_lazy = () -> CorporateActionPrice60.mmObject();
		}
	};
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails22;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forPriceDetails15;
			owner_lazy = () -> PriceDetails22.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption43;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption50);
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption32;
			owner_lazy = () -> CashOption43.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption49;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption49.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails24;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails24.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkPriceDetails25;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> PriceDetails25.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice62;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "Generic Cash Price Received per Product (OFFR) and Generic Cash Price Paid per Product (PRPP) are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice62.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice66;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice66.mmObject();
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCorporateActionPrice64;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, etc.) is derived from the event type.";
			owner_lazy = () -> CorporateActionPrice64.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline#forCashOption43
	 * ConstraintGenericCashPricePerProductGuideline.forCashOption43}</li>
	 * </ul>
	 */
	public static final MMConstraint<CashOption50> forCashOption50 = new MMConstraint<CashOption50>() {
		{
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption50;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			previousVersion_lazy = () -> com.tools20022.repository.constraints.ConstraintGenericCashPricePerProductGuideline.forCashOption43;
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
			validator = ConstraintGenericCashPricePerProductGuideline::checkCashOption53;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GenericCashPricePerProductGuideline";
			definition = "GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are prices received or paid in the course of an event. The specific meaning (redemption price, subscription price, reinvestment price, ETC.) is derived from the event type.";
			owner_lazy = () -> CashOption53.mmObject();
		}
	};

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
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice11(CorporateActionPrice11 obj) throws Exception {
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
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice29(CorporateActionPrice29 obj) throws Exception {
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
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice5(CorporateActionPrice5 obj) throws Exception {
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
	public static void checkCashOption12(CashOption12 obj) throws Exception {
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
	public static void checkCorporateActionPrice27(CorporateActionPrice27 obj) throws Exception {
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
	public static void checkCorporateActionPrice33(CorporateActionPrice33 obj) throws Exception {
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
	public static void checkPriceDetails11(PriceDetails11 obj) throws Exception {
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
	public static void checkPriceDetails12(PriceDetails12 obj) throws Exception {
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
	public static void checkCorporateActionPrice14(CorporateActionPrice14 obj) throws Exception {
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
	public static void checkCorporateActionPrice26(CorporateActionPrice26 obj) throws Exception {
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
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails8(PriceDetails8 obj) throws Exception {
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
	public static void checkPriceDetails10(PriceDetails10 obj) throws Exception {
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
	public static void checkPriceDetails13(PriceDetails13 obj) throws Exception {
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
	public static void checkCashOption15(CashOption15 obj) throws Exception {
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
	public static void checkCorporateActionPrice37(CorporateActionPrice37 obj) throws Exception {
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
	public static void checkCashOption24(CashOption24 obj) throws Exception {
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
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails14(PriceDetails14 obj) throws Exception {
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
	 * Generic Cash Price Received per Product (OFFR) and Generic Cash Price
	 * Paid per Product (PRPP) are prices received or paid in the course of an
	 * event. The specific meaning (redemption price, subscription price,
	 * reinvestment price, ETC.) is derived from the event type.
	 */
	public static void checkCorporateActionPrice44(CorporateActionPrice44 obj) throws Exception {
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
	public static void checkCashOption32(CashOption32 obj) throws Exception {
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
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkPriceDetails18(PriceDetails18 obj) throws Exception {
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
	 * (redemption price, subscription price, reinvestment price, ETC.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice55(CorporateActionPrice55 obj) throws Exception {
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
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice59(CorporateActionPrice59 obj) throws Exception {
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
	 * GenericCashPriceReceivedPerProduct and GenericCashPricePaidPerProduct are
	 * prices received or paid in the course of an event. The specific meaning
	 * (redemption price, subscription price, reinvestment price, etc.) is
	 * derived from the event type.
	 */
	public static void checkCorporateActionPrice56(CorporateActionPrice56 obj) throws Exception {
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
	public static void checkPriceDetails22(PriceDetails22 obj) throws Exception {
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
	public static void checkCashOption49(CashOption49 obj) throws Exception {
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
	public static void checkPriceDetails25(PriceDetails25 obj) throws Exception {
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
	public static void checkCashOption50(CashOption50 obj) throws Exception {
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
}