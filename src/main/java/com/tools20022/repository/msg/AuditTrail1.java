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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes information needed to identify a change for a static data, the time
 * when it was performed and the user requesting the change and approving it.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AuditTrail1#mmFieldName
 * AuditTrail1.mmFieldName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuditTrail1#mmOldFieldValue
 * AuditTrail1.mmOldFieldValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuditTrail1#mmNewFieldValue
 * AuditTrail1.mmNewFieldValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AuditTrail1#mmOperationTimeStamp
 * AuditTrail1.mmOperationTimeStamp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuditTrail1#mmInstructingUser
 * AuditTrail1.mmInstructingUser}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AuditTrail1#mmApprovingUser
 * AuditTrail1.mmApprovingUser}</li>
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
 * "AuditTrail1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes information needed to identify a change for a static data, the time when it was performed and the user requesting the change and approving it."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AuditTrail1", propOrder = {"fieldName", "oldFieldValue", "newFieldValue", "operationTimeStamp", "instructingUser", "approvingUser"})
public class AuditTrail1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.AuditTrail1 AuditTrail1}</li>
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
	 * definition} = "Name of the field whose value has been changed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFieldName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuditTrail1.mmObject();
			isDerived = false;
			xmlTag = "FldNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FieldName";
			definition = "Name of the field whose value has been changed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AuditTrail1 AuditTrail1}</li>
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
	 * definition} = "Value of the field before the change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOldFieldValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuditTrail1.mmObject();
			isDerived = false;
			xmlTag = "OdFldVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OldFieldValue";
			definition = "Value of the field before the change.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AuditTrail1 AuditTrail1}</li>
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
	 * definition} = "Value of the field after the change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewFieldValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuditTrail1.mmObject();
			isDerived = false;
			xmlTag = "NewFldVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewFieldValue";
			definition = "Value of the field after the change.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AuditTrail1 AuditTrail1}</li>
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
	 * definition} = "Timestamp of the change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOperationTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuditTrail1.mmObject();
			isDerived = false;
			xmlTag = "OprTmStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationTimeStamp";
			definition = "Timestamp of the change.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "InstgUsr", required = true)
	protected Max256Text instructingUser;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuditTrail1 AuditTrail1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgUsr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingUser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "User who instructed the change."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructingUser = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuditTrail1.mmObject();
			isDerived = false;
			xmlTag = "InstgUsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingUser";
			definition = "User who instructed the change.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "ApprvgUsr")
	protected Max256Text approvingUser;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AuditTrail1 AuditTrail1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApprvgUsr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovingUser"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "User who approved the change instructed by the instructing user."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApprovingUser = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AuditTrail1.mmObject();
			isDerived = false;
			xmlTag = "ApprvgUsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovingUser";
			definition = "User who approved the change instructed by the instructing user.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AuditTrail1.mmFieldName, com.tools20022.repository.msg.AuditTrail1.mmOldFieldValue, com.tools20022.repository.msg.AuditTrail1.mmNewFieldValue,
						com.tools20022.repository.msg.AuditTrail1.mmOperationTimeStamp, com.tools20022.repository.msg.AuditTrail1.mmInstructingUser, com.tools20022.repository.msg.AuditTrail1.mmApprovingUser);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AuditTrail1";
				definition = "Describes information needed to identify a change for a static data, the time when it was performed and the user requesting the change and approving it.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getFieldName() {
		return fieldName;
	}

	public AuditTrail1 setFieldName(Max35Text fieldName) {
		this.fieldName = Objects.requireNonNull(fieldName);
		return this;
	}

	public Max350Text getOldFieldValue() {
		return oldFieldValue;
	}

	public AuditTrail1 setOldFieldValue(Max350Text oldFieldValue) {
		this.oldFieldValue = Objects.requireNonNull(oldFieldValue);
		return this;
	}

	public Max350Text getNewFieldValue() {
		return newFieldValue;
	}

	public AuditTrail1 setNewFieldValue(Max350Text newFieldValue) {
		this.newFieldValue = Objects.requireNonNull(newFieldValue);
		return this;
	}

	public ISODateTime getOperationTimeStamp() {
		return operationTimeStamp;
	}

	public AuditTrail1 setOperationTimeStamp(ISODateTime operationTimeStamp) {
		this.operationTimeStamp = Objects.requireNonNull(operationTimeStamp);
		return this;
	}

	public Max256Text getInstructingUser() {
		return instructingUser;
	}

	public AuditTrail1 setInstructingUser(Max256Text instructingUser) {
		this.instructingUser = Objects.requireNonNull(instructingUser);
		return this;
	}

	public Optional<Max256Text> getApprovingUser() {
		return approvingUser == null ? Optional.empty() : Optional.of(approvingUser);
	}

	public AuditTrail1 setApprovingUser(Max256Text approvingUser) {
		this.approvingUser = approvingUser;
		return this;
	}
}