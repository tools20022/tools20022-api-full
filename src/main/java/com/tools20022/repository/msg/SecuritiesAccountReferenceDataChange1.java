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
import com.tools20022.repository.msg.SecuritiesAccount13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1#mmSecuritiesAccountIdentification
 * SecuritiesAccountReferenceDataChange1.mmSecuritiesAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1#mmFieldName
 * SecuritiesAccountReferenceDataChange1.mmFieldName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1#mmOldFieldValue
 * SecuritiesAccountReferenceDataChange1.mmOldFieldValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1#mmNewFieldValue
 * SecuritiesAccountReferenceDataChange1.mmNewFieldValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1#mmOperationTimeStamp
 * SecuritiesAccountReferenceDataChange1.mmOperationTimeStamp}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesAccountReferenceDataChange1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the comparison between the currently established baseline elements and the proposed ones."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange2
 * SecuritiesAccountReferenceDataChange2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesAccountReferenceDataChange1", propOrder = {"securitiesAccountIdentification", "fieldName", "oldFieldValue", "newFieldValue", "operationTimeStamp"})
public class SecuritiesAccountReferenceDataChange1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesAcctId", required = true)
	protected SecuritiesAccount13 securitiesAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount13
	 * SecuritiesAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1
	 * SecuritiesAccountReferenceDataChange1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the securities account for which the changes are listed in the advice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange2#mmSecuritiesAccountIdentification
	 * SecuritiesAccountReferenceDataChange2.mmSecuritiesAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesAccountReferenceDataChange1, SecuritiesAccount13> mmSecuritiesAccountIdentification = new MMMessageAssociationEnd<SecuritiesAccountReferenceDataChange1, SecuritiesAccount13>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "SctiesAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesAccountIdentification";
			definition = "Identifies the securities account for which the changes are listed in the advice.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReferenceDataChange2.mmSecuritiesAccountIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount13.mmObject();
		}

		@Override
		public SecuritiesAccount13 getValue(SecuritiesAccountReferenceDataChange1 obj) {
			return obj.getSecuritiesAccountIdentification();
		}

		@Override
		public void setValue(SecuritiesAccountReferenceDataChange1 obj, SecuritiesAccount13 value) {
			obj.setSecuritiesAccountIdentification(value);
		}
	};
	@XmlElement(name = "FldNm", required = true)
	protected Max35Text fieldName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1
	 * SecuritiesAccountReferenceDataChange1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange2#mmFieldName
	 * SecuritiesAccountReferenceDataChange2.mmFieldName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReferenceDataChange1, Max35Text> mmFieldName = new MMMessageAttribute<SecuritiesAccountReferenceDataChange1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "FldNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FieldName";
			definition = "Name of the element, as specified in the short tag name for the field in the message.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReferenceDataChange2.mmFieldName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecuritiesAccountReferenceDataChange1 obj) {
			return obj.getFieldName();
		}

		@Override
		public void setValue(SecuritiesAccountReferenceDataChange1 obj, Max35Text value) {
			obj.setFieldName(value);
		}
	};
	@XmlElement(name = "OdFldVal", required = true)
	protected Max350Text oldFieldValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1
	 * SecuritiesAccountReferenceDataChange1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange2#mmOldFieldValue
	 * SecuritiesAccountReferenceDataChange2.mmOldFieldValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReferenceDataChange1, Max350Text> mmOldFieldValue = new MMMessageAttribute<SecuritiesAccountReferenceDataChange1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "OdFldVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldFieldValue";
			definition = "Value of the related field before the change was applied.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReferenceDataChange2.mmOldFieldValue);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(SecuritiesAccountReferenceDataChange1 obj) {
			return obj.getOldFieldValue();
		}

		@Override
		public void setValue(SecuritiesAccountReferenceDataChange1 obj, Max350Text value) {
			obj.setOldFieldValue(value);
		}
	};
	@XmlElement(name = "NewFldVal", required = true)
	protected Max350Text newFieldValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1
	 * SecuritiesAccountReferenceDataChange1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange2#mmNewFieldValue
	 * SecuritiesAccountReferenceDataChange2.mmNewFieldValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReferenceDataChange1, Max350Text> mmNewFieldValue = new MMMessageAttribute<SecuritiesAccountReferenceDataChange1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "NewFldVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewFieldValue";
			definition = "Value of the related field after the change was applied.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReferenceDataChange2.mmNewFieldValue);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(SecuritiesAccountReferenceDataChange1 obj) {
			return obj.getNewFieldValue();
		}

		@Override
		public void setValue(SecuritiesAccountReferenceDataChange1 obj, Max350Text value) {
			obj.setNewFieldValue(value);
		}
	};
	@XmlElement(name = "OprTmStmp", required = true)
	protected ISODateTime operationTimeStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1
	 * SecuritiesAccountReferenceDataChange1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange2#mmOperationTimeStamp
	 * SecuritiesAccountReferenceDataChange2.mmOperationTimeStamp}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesAccountReferenceDataChange1, ISODateTime> mmOperationTimeStamp = new MMMessageAttribute<SecuritiesAccountReferenceDataChange1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmObject();
			isDerived = false;
			xmlTag = "OprTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationTimeStamp";
			definition = "Specifies the timestamp of the operation.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReferenceDataChange2.mmOperationTimeStamp);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(SecuritiesAccountReferenceDataChange1 obj) {
			return obj.getOperationTimeStamp();
		}

		@Override
		public void setValue(SecuritiesAccountReferenceDataChange1 obj, ISODateTime value) {
			obj.setOperationTimeStamp(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmSecuritiesAccountIdentification,
						com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmFieldName, com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmOldFieldValue,
						com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmNewFieldValue, com.tools20022.repository.msg.SecuritiesAccountReferenceDataChange1.mmOperationTimeStamp);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuritiesAccountReferenceDataChange1";
				definition = "Describes the comparison between the currently established baseline elements and the proposed ones.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesAccountReferenceDataChange2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount13 getSecuritiesAccountIdentification() {
		return securitiesAccountIdentification;
	}

	public SecuritiesAccountReferenceDataChange1 setSecuritiesAccountIdentification(SecuritiesAccount13 securitiesAccountIdentification) {
		this.securitiesAccountIdentification = Objects.requireNonNull(securitiesAccountIdentification);
		return this;
	}

	public Max35Text getFieldName() {
		return fieldName;
	}

	public SecuritiesAccountReferenceDataChange1 setFieldName(Max35Text fieldName) {
		this.fieldName = Objects.requireNonNull(fieldName);
		return this;
	}

	public Max350Text getOldFieldValue() {
		return oldFieldValue;
	}

	public SecuritiesAccountReferenceDataChange1 setOldFieldValue(Max350Text oldFieldValue) {
		this.oldFieldValue = Objects.requireNonNull(oldFieldValue);
		return this;
	}

	public Max350Text getNewFieldValue() {
		return newFieldValue;
	}

	public SecuritiesAccountReferenceDataChange1 setNewFieldValue(Max350Text newFieldValue) {
		this.newFieldValue = Objects.requireNonNull(newFieldValue);
		return this;
	}

	public ISODateTime getOperationTimeStamp() {
		return operationTimeStamp;
	}

	public SecuritiesAccountReferenceDataChange1 setOperationTimeStamp(ISODateTime operationTimeStamp) {
		this.operationTimeStamp = Objects.requireNonNull(operationTimeStamp);
		return this;
	}
}