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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.Max35Text;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Environment of the withdrawal transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment1#Acquirer
 * ATMEnvironment1.Acquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#ATMManagerIdentification
 * ATMEnvironment1.ATMManagerIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment1#HostingEntity
 * ATMEnvironment1.HostingEntity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment1#ATM
 * ATMEnvironment1.ATM}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment1#Customer
 * ATMEnvironment1.Customer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment1#Card
 * ATMEnvironment1.Card}</li>
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
 * "ATMEnvironment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the withdrawal transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3
 * ATMEnvironment3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2
 * ATMEnvironment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4
 * ATMEnvironment4}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ATMEnvironment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Acquirer of the withdrawal transaction, in charge of the funds settlement
	 * with the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer7 Acquirer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer of the withdrawal transaction, in charge of the funds settlement with the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3#Acquirer
	 * ATMEnvironment3.Acquirer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#Acquirer
	 * ATMEnvironment2.Acquirer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#Acquirer
	 * ATMEnvironment4.Acquirer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Acquirer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the withdrawal transaction, in charge of the funds settlement with the issuer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment3.Acquirer, com.tools20022.repository.msg.ATMEnvironment2.Acquirer, com.tools20022.repository.msg.ATMEnvironment4.Acquirer);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Acquirer7.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Identification of the ATM manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMMgrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMManagerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the ATM manager."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment3#ATMManagerIdentification
	 * ATMEnvironment3.ATMManagerIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#ATMManager
	 * ATMEnvironment2.ATMManager}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4#ATMManagerIdentification
	 * ATMEnvironment4.ATMManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute ATMManagerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "ATMMgrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManagerIdentification";
			definition = "Identification of the ATM manager.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment3.ATMManagerIdentification, com.tools20022.repository.msg.ATMEnvironment2.ATMManager,
					com.tools20022.repository.msg.ATMEnvironment4.ATMManagerIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Entity hosting the ATM terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TerminalHosting1
	 * TerminalHosting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstgNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostingEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity hosting the ATM terminal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment3#HostingEntity
	 * ATMEnvironment3.HostingEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#HostingEntity
	 * ATMEnvironment2.HostingEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4#HostingEntity
	 * ATMEnvironment4.HostingEntity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd HostingEntity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "HstgNtty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM terminal.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment3.HostingEntity, com.tools20022.repository.msg.ATMEnvironment2.HostingEntity, com.tools20022.repository.msg.ATMEnvironment4.HostingEntity);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TerminalHosting1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * ATM information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1
	 * AutomatedTellerMachine1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3#ATM
	 * ATMEnvironment3.ATM}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#ATM
	 * ATMEnvironment2.ATM}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#ATM
	 * ATMEnvironment4.ATM}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ATM = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment3.ATM, com.tools20022.repository.msg.ATMEnvironment2.ATM, com.tools20022.repository.msg.ATMEnvironment4.ATM);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AutomatedTellerMachine1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Customer involved in the withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCustomer1
	 * ATMCustomer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cstmr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Customer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer involved in the withdrawal transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3#Customer
	 * ATMEnvironment3.Customer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#Customer
	 * ATMEnvironment2.Customer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#Customer
	 * ATMEnvironment4.Customer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Customer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Cstmr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Customer";
			definition = "Customer involved in the withdrawal transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment3.Customer, com.tools20022.repository.msg.ATMEnvironment2.Customer, com.tools20022.repository.msg.ATMEnvironment4.Customer);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ATMCustomer1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Card performing the withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard16
	 * PaymentCard16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card performing the withdrawal transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3#Card
	 * ATMEnvironment3.Card}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#PlainCardData
	 * ATMEnvironment2.PlainCardData}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#Card
	 * ATMEnvironment4.Card}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Card = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Card performing the withdrawal transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment3.Card, com.tools20022.repository.msg.ATMEnvironment2.PlainCardData, com.tools20022.repository.msg.ATMEnvironment4.Card);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PaymentCard16.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment1.Acquirer, com.tools20022.repository.msg.ATMEnvironment1.ATMManagerIdentification,
						com.tools20022.repository.msg.ATMEnvironment1.HostingEntity, com.tools20022.repository.msg.ATMEnvironment1.ATM, com.tools20022.repository.msg.ATMEnvironment1.Customer,
						com.tools20022.repository.msg.ATMEnvironment1.Card);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment1";
				definition = "Environment of the withdrawal transaction.";
				nextVersions_lazy = () -> Arrays.asList(ATMEnvironment3.mmObject(), ATMEnvironment2.mmObject(), ATMEnvironment4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}