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
import com.tools20022.repository.msg.GenericIdentification73;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment6#mmSendingInstitution
 * CardTransactionEnvironment6.mmSendingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment6#mmReceivingInstitution
 * CardTransactionEnvironment6.mmReceivingInstitution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardTransactionEnvironment6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5
 * CardTransactionEnvironment5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransactionEnvironment6", propOrder = {"sendingInstitution", "receivingInstitution"})
public class CardTransactionEnvironment6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SndgInstn", required = true)
	protected GenericIdentification73 sendingInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73
	 * GenericIdentification73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment6
	 * CardTransactionEnvironment6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndgInstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institution initiator of the reconciliation (correspond to the ISO 8583 field 94)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmSendingInstitution
	 * CardTransactionEnvironment5.mmSendingInstitution}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment6, GenericIdentification73> mmSendingInstitution = new MMMessageAssociationEnd<CardTransactionEnvironment6, GenericIdentification73>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment6.mmObject();
			isDerived = false;
			xmlTag = "SndgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendingInstitution";
			definition = "Institution initiator of the reconciliation (correspond to the ISO 8583 field 94).";
			previousVersion_lazy = () -> CardTransactionEnvironment5.mmSendingInstitution;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification73.mmObject();
		}

		@Override
		public GenericIdentification73 getValue(CardTransactionEnvironment6 obj) {
			return obj.getSendingInstitution();
		}

		@Override
		public void setValue(CardTransactionEnvironment6 obj, GenericIdentification73 value) {
			obj.setSendingInstitution(value);
		}
	};
	@XmlElement(name = "RcvgInstn", required = true)
	protected GenericIdentification73 receivingInstitution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73
	 * GenericIdentification73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment6
	 * CardTransactionEnvironment6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgInstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institution destination of the reconciliation (correspond to the ISO 8583 field 93)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment5#mmReceivingInstitution
	 * CardTransactionEnvironment5.mmReceivingInstitution}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardTransactionEnvironment6, GenericIdentification73> mmReceivingInstitution = new MMMessageAssociationEnd<CardTransactionEnvironment6, GenericIdentification73>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionEnvironment6.mmObject();
			isDerived = false;
			xmlTag = "RcvgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingInstitution";
			definition = "Institution destination of the reconciliation (correspond to the ISO 8583 field 93).";
			previousVersion_lazy = () -> CardTransactionEnvironment5.mmReceivingInstitution;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification73.mmObject();
		}

		@Override
		public GenericIdentification73 getValue(CardTransactionEnvironment6 obj) {
			return obj.getReceivingInstitution();
		}

		@Override
		public void setValue(CardTransactionEnvironment6 obj, GenericIdentification73 value) {
			obj.setReceivingInstitution(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransactionEnvironment6.mmSendingInstitution, com.tools20022.repository.msg.CardTransactionEnvironment6.mmReceivingInstitution);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionEnvironment6";
				definition = "Environment of the transaction.";
				previousVersion_lazy = () -> CardTransactionEnvironment5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification73 getSendingInstitution() {
		return sendingInstitution;
	}

	public CardTransactionEnvironment6 setSendingInstitution(GenericIdentification73 sendingInstitution) {
		this.sendingInstitution = Objects.requireNonNull(sendingInstitution);
		return this;
	}

	public GenericIdentification73 getReceivingInstitution() {
		return receivingInstitution;
	}

	public CardTransactionEnvironment6 setReceivingInstitution(GenericIdentification73 receivingInstitution) {
		this.receivingInstitution = Objects.requireNonNull(receivingInstitution);
		return this;
	}
}