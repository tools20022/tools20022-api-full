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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCustomer2;
import com.tools20022.repository.msg.AutomatedTellerMachine2;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.PlainCardData14;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment5#mmATM
 * ATMEnvironment5.mmATM}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment5#mmCustomer
 * ATMEnvironment5.mmCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment5#mmProtectedCardData
 * ATMEnvironment5.mmProtectedCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment5#mmPlainCardData
 * ATMEnvironment5.mmPlainCardData}</li>
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
 * "ATMEnvironment5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMEnvironment2
 * ATMEnvironment2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEnvironment5", propOrder = {"aTM", "customer", "protectedCardData", "plainCardData"})
public class ATMEnvironment5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ATM", required = true)
	protected AutomatedTellerMachine2 aTM;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine2
	 * AutomatedTellerMachine2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment5
	 * ATMEnvironment5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmATM
	 * ATMEnvironment2.mmATM}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment5, AutomatedTellerMachine2> mmATM = new MMMessageAssociationEnd<ATMEnvironment5, AutomatedTellerMachine2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment5.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			previousVersion_lazy = () -> ATMEnvironment2.mmATM;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AutomatedTellerMachine2.mmObject();
		}

		@Override
		public AutomatedTellerMachine2 getValue(ATMEnvironment5 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMEnvironment5 obj, AutomatedTellerMachine2 value) {
			obj.setATM(value);
		}
	};
	@XmlElement(name = "Cstmr", required = true)
	protected ATMCustomer2 customer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCustomer2
	 * ATMCustomer2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment5
	 * ATMEnvironment5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmCustomer
	 * ATMEnvironment2.mmCustomer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment5, ATMCustomer2> mmCustomer = new MMMessageAssociationEnd<ATMEnvironment5, ATMCustomer2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment5.mmObject();
			isDerived = false;
			xmlTag = "Cstmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Customer";
			definition = "Customer involved in the withdrawal transaction.";
			previousVersion_lazy = () -> ATMEnvironment2.mmCustomer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMCustomer2.mmObject();
		}

		@Override
		public ATMCustomer2 getValue(ATMEnvironment5 obj) {
			return obj.getCustomer();
		}

		@Override
		public void setValue(ATMEnvironment5 obj, ATMCustomer2 value) {
			obj.setCustomer(value);
		}
	};
	@XmlElement(name = "PrtctdCardData")
	protected ContentInformationType10 protectedCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment5
	 * ATMEnvironment5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encryption of the sensitive card data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmProtectedCardData
	 * ATMEnvironment2.mmProtectedCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment5, Optional<ContentInformationType10>> mmProtectedCardData = new MMMessageAssociationEnd<ATMEnvironment5, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment5.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Encryption of the sensitive card data.";
			previousVersion_lazy = () -> ATMEnvironment2.mmProtectedCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMEnvironment5 obj) {
			return obj.getProtectedCardData();
		}

		@Override
		public void setValue(ATMEnvironment5 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "PlainCardData")
	protected PlainCardData14 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment5
	 * ATMEnvironment5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive data associated with the card performing the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmPlainCardData
	 * ATMEnvironment2.mmPlainCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment5, Optional<PlainCardData14>> mmPlainCardData = new MMMessageAssociationEnd<ATMEnvironment5, Optional<PlainCardData14>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment5.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			previousVersion_lazy = () -> ATMEnvironment2.mmPlainCardData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlainCardData14.mmObject();
		}

		@Override
		public Optional<PlainCardData14> getValue(ATMEnvironment5 obj) {
			return obj.getPlainCardData();
		}

		@Override
		public void setValue(ATMEnvironment5 obj, Optional<PlainCardData14> value) {
			obj.setPlainCardData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment5.mmATM, com.tools20022.repository.msg.ATMEnvironment5.mmCustomer, com.tools20022.repository.msg.ATMEnvironment5.mmProtectedCardData,
						com.tools20022.repository.msg.ATMEnvironment5.mmPlainCardData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment5";
				definition = "Environment of the transaction.";
				previousVersion_lazy = () -> ATMEnvironment2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AutomatedTellerMachine2 getATM() {
		return aTM;
	}

	public ATMEnvironment5 setATM(AutomatedTellerMachine2 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}

	public ATMCustomer2 getCustomer() {
		return customer;
	}

	public ATMEnvironment5 setCustomer(ATMCustomer2 customer) {
		this.customer = Objects.requireNonNull(customer);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedCardData() {
		return protectedCardData == null ? Optional.empty() : Optional.of(protectedCardData);
	}

	public ATMEnvironment5 setProtectedCardData(ContentInformationType10 protectedCardData) {
		this.protectedCardData = protectedCardData;
		return this;
	}

	public Optional<PlainCardData14> getPlainCardData() {
		return plainCardData == null ? Optional.empty() : Optional.of(plainCardData);
	}

	public ATMEnvironment5 setPlainCardData(PlainCardData14 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}
}