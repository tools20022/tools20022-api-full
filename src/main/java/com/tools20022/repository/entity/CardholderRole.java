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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CardPaymentPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Party entitled by a card issuer to use a card.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CardholderRole" src="doc-files/CardholderRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CardPaymentPartyRole
 * CardPaymentPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardholderRole#mmAuthentication
 * CardholderRole.mmAuthentication}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmCardholder
 * Authentication.mmCardholder}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard2#mmHolderName
 * PaymentCard2.mmHolderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment6#mmCardholder
 * CardPaymentEnvironment6.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment14#mmCardholder
 * CardPaymentEnvironment14.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment1#mmCardholder
 * CardPaymentEnvironment1.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment9#mmCardholder
 * CardPaymentEnvironment9.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment2#mmCardholder
 * CardPaymentEnvironment2.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment10#mmCardholder
 * CardPaymentEnvironment10.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment20#mmCardholder
 * CardPaymentEnvironment20.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment27#mmCardholder
 * CardPaymentEnvironment27.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment22#mmCardholder
 * CardPaymentEnvironment22.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32#mmCardholder
 * CardPaymentEnvironment32.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment40#mmCardholder
 * CardPaymentEnvironment40.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment34#mmCardholder
 * CardPaymentEnvironment34.mmCardholder}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard18#mmHolderName
 * PaymentCard18.mmHolderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment52#mmCardholder
 * CardPaymentEnvironment52.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment45#mmCardholder
 * CardPaymentEnvironment45.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment53#mmCardholder
 * CardPaymentEnvironment53.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment47#mmCardholder
 * CardPaymentEnvironment47.mmCardholder}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentCard25#mmHolderName
 * PaymentCard25.mmHolderName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment61#mmCardholder
 * CardPaymentEnvironment61.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment60#mmCardholder
 * CardPaymentEnvironment60.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment62#mmCardholder
 * CardPaymentEnvironment62.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment57#mmCardholder
 * CardPaymentEnvironment57.mmCardholder}</li>
 * </ul>
 * </li>
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
	protected List<com.tools20022.repository.entity.Authentication> authentication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmCardholder
	 * Authentication.mmCardholder}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentContext3#mmAuthenticationMethod
	 * PaymentContext3.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder2#mmAuthentication
	 * Cardholder2.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder4#mmAuthentication
	 * Cardholder4.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder1#mmAuthentication
	 * Cardholder1.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder3#mmAuthentication
	 * Cardholder3.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder5#mmAuthentication
	 * Cardholder5.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder6#mmAuthentication
	 * Cardholder6.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder7#mmAuthentication
	 * Cardholder7.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer1#mmAuthentication
	 * ATMCustomer1.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder9#mmAuthentication
	 * Cardholder9.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder10#mmAuthentication
	 * Cardholder10.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCustomer4#mmAuthentication
	 * ATMCustomer4.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Cardholder12#mmAuthentication
	 * Cardholder12.mmAuthentication}</li>
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
	public static final MMBusinessAssociationEnd mmAuthentication = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentContext3.mmAuthenticationMethod, Cardholder2.mmAuthentication, Cardholder4.mmAuthentication, Cardholder1.mmAuthentication, Cardholder3.mmAuthentication, Cardholder5.mmAuthentication,
					Cardholder6.mmAuthentication, Cardholder7.mmAuthentication, ATMCustomer1.mmAuthentication, Cardholder9.mmAuthentication, Cardholder10.mmAuthentication, ATMCustomer4.mmAuthentication, Cardholder12.mmAuthentication);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CardholderRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Authentication";
			definition = "Data related to the authentication of the cardholder.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Authentication.mmCardholder;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderRole";
				definition = "Party entitled by a card issuer to use a card.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Authentication.mmCardholder);
				derivationElement_lazy = () -> Arrays.asList(PaymentCard2.mmHolderName, CardPaymentEnvironment6.mmCardholder, CardPaymentEnvironment14.mmCardholder, CardPaymentEnvironment1.mmCardholder,
						CardPaymentEnvironment9.mmCardholder, CardPaymentEnvironment2.mmCardholder, CardPaymentEnvironment10.mmCardholder, CardPaymentEnvironment20.mmCardholder, CardPaymentEnvironment27.mmCardholder,
						CardPaymentEnvironment22.mmCardholder, CardPaymentEnvironment32.mmCardholder, CardPaymentEnvironment40.mmCardholder, CardPaymentEnvironment34.mmCardholder, PaymentCard18.mmHolderName,
						CardPaymentEnvironment52.mmCardholder, CardPaymentEnvironment45.mmCardholder, CardPaymentEnvironment53.mmCardholder, CardPaymentEnvironment47.mmCardholder, PaymentCard25.mmHolderName,
						CardPaymentEnvironment61.mmCardholder, CardPaymentEnvironment60.mmCardholder, CardPaymentEnvironment62.mmCardholder, CardPaymentEnvironment57.mmCardholder);
				superType_lazy = () -> CardPaymentPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CardholderRole.mmAuthentication);
				derivationComponent_lazy = () -> Arrays.asList(Cardholder2.mmObject(), Cardholder4.mmObject(), Cardholder1.mmObject(), Cardholder3.mmObject(), Cardholder5.mmObject(), Cardholder6.mmObject(), Cardholder8.mmObject(),
						Cardholder7.mmObject(), ATMCustomer1.mmObject(), ATMCustomer2.mmObject(), ATMCustomer3.mmObject(), Cardholder9.mmObject(), AntiMoneyLaundering1.mmObject(), Cardholder11.mmObject(), Cardholder10.mmObject(),
						ATMCustomer5.mmObject(), ATMCustomer6.mmObject(), ATMCustomer4.mmObject(), Cardholder12.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CardholderRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Authentication> getAuthentication() {
		return authentication == null ? authentication = new ArrayList<>() : authentication;
	}

	public CardholderRole setAuthentication(List<com.tools20022.repository.entity.Authentication> authentication) {
		this.authentication = Objects.requireNonNull(authentication);
		return this;
	}
}