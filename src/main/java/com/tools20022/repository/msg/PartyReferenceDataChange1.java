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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Describes the comparison between the currently established baseline elements
 * and the proposed ones.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1#mmPartyIdentification
 * PartyReferenceDataChange1.mmPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1#mmFieldName
 * PartyReferenceDataChange1.mmFieldName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1#mmOldFieldValue
 * PartyReferenceDataChange1.mmOldFieldValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1#mmNewFieldValue
 * PartyReferenceDataChange1.mmNewFieldValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1#mmOperationTimeStamp
 * PartyReferenceDataChange1.mmOperationTimeStamp}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyReferenceDataChange1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the comparison between the currently established baseline elements and the proposed ones."
 * </li>
 * </ul>
 */
public class PartyReferenceDataChange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemPartyIdentification3 partyIdentification;
	/**
	 * Identifies the party for which the changes are listed in the advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3
	 * SystemPartyIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1
	 * PartyReferenceDataChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party for which the changes are listed in the advice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPartyIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PartyReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Identifies the party for which the changes are listed in the advice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification3.mmObject();
		}
	};
	protected Max35Text fieldName;
	/**
	 * Name of the element, as specified in the short tag name for the field in
	 * the message.
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
	 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1
	 * PartyReferenceDataChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FldNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FieldName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the element, as specified in the short tag name for the field in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFieldName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "FldNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FieldName";
			definition = "Name of the element, as specified in the short tag name for the field in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max350Text oldFieldValue;
	/**
	 * Value of the related field before the change was applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1
	 * PartyReferenceDataChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OdFldVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OldFieldValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the related field before the change was applied."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOldFieldValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "OdFldVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldFieldValue";
			definition = "Value of the related field before the change was applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max350Text newFieldValue;
	/**
	 * Value of the related field after the change was applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1
	 * PartyReferenceDataChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewFldVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewFieldValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the related field after the change was applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewFieldValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "NewFldVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewFieldValue";
			definition = "Value of the related field after the change was applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ISODateTime operationTimeStamp;
	/**
	 * Specifies the timestamp of the operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyReferenceDataChange1
	 * PartyReferenceDataChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprTmStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the timestamp of the operation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOperationTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PartyReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "OprTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationTimeStamp";
			definition = "Specifies the timestamp of the operation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyReferenceDataChange1.mmPartyIdentification, PartyReferenceDataChange1.mmFieldName, PartyReferenceDataChange1.mmOldFieldValue, PartyReferenceDataChange1.mmNewFieldValue,
						PartyReferenceDataChange1.mmOperationTimeStamp);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyReferenceDataChange1";
				definition = "Describes the comparison between the currently established baseline elements and the proposed ones.";
			}
		});
		return mmObject_lazy.get();
	}

	public SystemPartyIdentification3 getPartyIdentification() {
		return partyIdentification;
	}

	public void setPartyIdentification(com.tools20022.repository.msg.SystemPartyIdentification3 partyIdentification) {
		this.partyIdentification = partyIdentification;
	}

	public Max35Text getFieldName() {
		return fieldName;
	}

	public void setFieldName(Max35Text fieldName) {
		this.fieldName = fieldName;
	}

	public Max350Text getOldFieldValue() {
		return oldFieldValue;
	}

	public void setOldFieldValue(Max350Text oldFieldValue) {
		this.oldFieldValue = oldFieldValue;
	}

	public Max350Text getNewFieldValue() {
		return newFieldValue;
	}

	public void setNewFieldValue(Max350Text newFieldValue) {
		this.newFieldValue = newFieldValue;
	}

	public ISODateTime getOperationTimeStamp() {
		return operationTimeStamp;
	}

	public void setOperationTimeStamp(ISODateTime operationTimeStamp) {
		this.operationTimeStamp = operationTimeStamp;
	}
}