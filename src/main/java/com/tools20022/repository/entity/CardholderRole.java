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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.CardPaymentPartyRole;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party entitled by a card issuer to use a card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardholderRole" src="doc-files/CardholderRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardholderRole#Authentication
 * CardholderRole.Authentication}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#Cardholder
 * Authentication.Cardholder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#HolderName
 * PaymentCard2.HolderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment6#Cardholder
 * CardPaymentEnvironment6.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#Cardholder
 * CardPaymentEnvironment14.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#Cardholder
 * CardPaymentEnvironment1.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#Cardholder
 * CardPaymentEnvironment9.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment2#Cardholder
 * CardPaymentEnvironment2.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#Cardholder
 * CardPaymentEnvironment10.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#Cardholder
 * CardPaymentEnvironment20.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#Cardholder
 * CardPaymentEnvironment27.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#Cardholder
 * CardPaymentEnvironment22.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#Cardholder
 * CardPaymentEnvironment32.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#Cardholder
 * CardPaymentEnvironment40.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#Cardholder
 * CardPaymentEnvironment34.Cardholder}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#HolderName
 * PaymentCard18.HolderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#Cardholder
 * CardPaymentEnvironment52.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#Cardholder
 * CardPaymentEnvironment45.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#Cardholder
 * CardPaymentEnvironment53.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#Cardholder
 * CardPaymentEnvironment47.Cardholder}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#HolderName
 * PaymentCard25.HolderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#Cardholder
 * CardPaymentEnvironment61.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#Cardholder
 * CardPaymentEnvironment60.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#Cardholder
 * CardPaymentEnvironment62.Cardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#Cardholder
 * CardPaymentEnvironment57.Cardholder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder2 Cardholder2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder4 Cardholder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder1 Cardholder1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder3 Cardholder3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5 Cardholder5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder6 Cardholder6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder8 Cardholder8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder7 Cardholder7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer1 ATMCustomer1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer2 ATMCustomer2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer3 ATMCustomer3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder9 Cardholder9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
 * AntiMoneyLaundering1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder11 Cardholder11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder10 Cardholder10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer5 ATMCustomer5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer6 ATMCustomer6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCustomer4 ATMCustomer4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Cardholder12 Cardholder12}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardholderRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party entitled by a card issuer to use a card."</li>
 * </ul>
 */
public class CardholderRole extends CardPaymentPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Data related to the authentication of the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#Cardholder
	 * Authentication.Cardholder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#AuthenticationMethod
	 * PaymentContext3.AuthenticationMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder2#Authentication
	 * Cardholder2.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder4#Authentication
	 * Cardholder4.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder1#Authentication
	 * Cardholder1.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder3#Authentication
	 * Cardholder3.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder5#Authentication
	 * Cardholder5.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder6#Authentication
	 * Cardholder6.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder7#Authentication
	 * Cardholder7.Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer1#Authentication
	 * ATMCustomer1.Authentication}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Cardholder9#Authentication
	 * Cardholder9.Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder10#Authentication
	 * Cardholder10.Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer4#Authentication
	 * ATMCustomer4.Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder12#Authentication
	 * Cardholder12.Authentication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authentication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data related to the authentication of the cardholder."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Authentication = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentContext3.AuthenticationMethod, com.tools20022.repository.msg.Cardholder2.Authentication, com.tools20022.repository.msg.Cardholder4.Authentication,
					com.tools20022.repository.msg.Cardholder1.Authentication, com.tools20022.repository.msg.Cardholder3.Authentication, com.tools20022.repository.msg.Cardholder5.Authentication,
					com.tools20022.repository.msg.Cardholder6.Authentication, com.tools20022.repository.msg.Cardholder7.Authentication, com.tools20022.repository.msg.ATMCustomer1.Authentication,
					com.tools20022.repository.msg.Cardholder9.Authentication, com.tools20022.repository.msg.Cardholder10.Authentication, com.tools20022.repository.msg.ATMCustomer4.Authentication,
					com.tools20022.repository.msg.Cardholder12.Authentication);
			elementContext_lazy = () -> CardholderRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Authentication";
			definition = "Data related to the authentication of the cardholder.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Authentication.Cardholder;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardholderRole";
				definition = "Party entitled by a card issuer to use a card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Authentication.Cardholder);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCard2.HolderName, com.tools20022.repository.msg.CardPaymentEnvironment6.Cardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment14.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment1.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment9.Cardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment2.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment10.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment20.Cardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment27.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment22.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment32.Cardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment40.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment34.Cardholder, com.tools20022.repository.msg.PaymentCard18.HolderName,
						com.tools20022.repository.msg.CardPaymentEnvironment52.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment45.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment53.Cardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment47.Cardholder, com.tools20022.repository.msg.PaymentCard25.HolderName, com.tools20022.repository.msg.CardPaymentEnvironment61.Cardholder,
						com.tools20022.repository.msg.CardPaymentEnvironment60.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment62.Cardholder, com.tools20022.repository.msg.CardPaymentEnvironment57.Cardholder);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardholderRole.Authentication);
				derivationComponent_lazy = () -> Arrays.asList(Cardholder2.mmObject(), Cardholder4.mmObject(), Cardholder1.mmObject(), Cardholder3.mmObject(), Cardholder5.mmObject(), Cardholder6.mmObject(), Cardholder8.mmObject(),
						Cardholder7.mmObject(), ATMCustomer1.mmObject(), ATMCustomer2.mmObject(), ATMCustomer3.mmObject(), Cardholder9.mmObject(), AntiMoneyLaundering1.mmObject(), Cardholder11.mmObject(), Cardholder10.mmObject(),
						ATMCustomer5.mmObject(), ATMCustomer6.mmObject(), ATMCustomer4.mmObject(), Cardholder12.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}