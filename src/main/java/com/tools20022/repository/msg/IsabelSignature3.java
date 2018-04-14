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
import com.tools20022.repository.datatype.Max64Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IsabelSignatureHash1;
import com.tools20022.repository.msg.IsabelSignatureRecord2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the signature of an Isabel file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelSignature3#mmHeader
 * IsabelSignature3.mmHeader}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelSignature3#mmRecord
 * IsabelSignature3.mmRecord}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IsabelSignature3#mmRandomBlock
 * IsabelSignature3.mmRandomBlock}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IsabelSignature3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the signature of an Isabel file."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IsabelSignature2 IsabelSignature2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IsabelSignature3", propOrder = {"header", "record", "randomBlock"})
public class IsabelSignature3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected IsabelSignatureHash1 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelSignatureHash1
	 * IsabelSignatureHash1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignature3
	 * IsabelSignature3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common signature elements applicable to all signature records."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignature2#mmHeader
	 * IsabelSignature2.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelSignature3, IsabelSignatureHash1> mmHeader = new MMMessageAssociationEnd<IsabelSignature3, IsabelSignatureHash1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignature3.mmObject();
			isDerived = false;
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Common signature elements applicable to all signature records.";
			previousVersion_lazy = () -> IsabelSignature2.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelSignatureHash1.mmObject();
		}

		@Override
		public IsabelSignatureHash1 getValue(IsabelSignature3 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(IsabelSignature3 obj, IsabelSignatureHash1 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "Rcrd", required = true)
	protected List<IsabelSignatureRecord2> record;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IsabelSignatureRecord2
	 * IsabelSignatureRecord2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignature3
	 * IsabelSignature3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Record"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Individual record of the file signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignature2#mmRecord
	 * IsabelSignature2.mmRecord}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IsabelSignature3, List<IsabelSignatureRecord2>> mmRecord = new MMMessageAssociationEnd<IsabelSignature3, List<IsabelSignatureRecord2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignature3.mmObject();
			isDerived = false;
			xmlTag = "Rcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Record";
			definition = "Individual record of the file signature.";
			previousVersion_lazy = () -> IsabelSignature2.mmRecord;
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IsabelSignatureRecord2.mmObject();
		}

		@Override
		public List<IsabelSignatureRecord2> getValue(IsabelSignature3 obj) {
			return obj.getRecord();
		}

		@Override
		public void setValue(IsabelSignature3 obj, List<IsabelSignatureRecord2> value) {
			obj.setRecord(value);
		}
	};
	@XmlElement(name = "RandBlck", required = true)
	protected Max64Text randomBlock;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max64Text
	 * Max64Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignature3
	 * IsabelSignature3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RandBlck"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RandomBlock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Random data related to the signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IsabelSignature2#mmRandomBlock
	 * IsabelSignature2.mmRandomBlock}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IsabelSignature3, Max64Text> mmRandomBlock = new MMMessageAttribute<IsabelSignature3, Max64Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IsabelSignature3.mmObject();
			isDerived = false;
			xmlTag = "RandBlck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RandomBlock";
			definition = "Random data related to the signature.";
			previousVersion_lazy = () -> IsabelSignature2.mmRandomBlock;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max64Text.mmObject();
		}

		@Override
		public Max64Text getValue(IsabelSignature3 obj) {
			return obj.getRandomBlock();
		}

		@Override
		public void setValue(IsabelSignature3 obj, Max64Text value) {
			obj.setRandomBlock(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IsabelSignature3.mmHeader, com.tools20022.repository.msg.IsabelSignature3.mmRecord, com.tools20022.repository.msg.IsabelSignature3.mmRandomBlock);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IsabelSignature3";
				definition = "Specifies the signature of an Isabel file.";
				previousVersion_lazy = () -> IsabelSignature2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public IsabelSignatureHash1 getHeader() {
		return header;
	}

	public IsabelSignature3 setHeader(IsabelSignatureHash1 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public List<IsabelSignatureRecord2> getRecord() {
		return record == null ? record = new ArrayList<>() : record;
	}

	public IsabelSignature3 setRecord(List<IsabelSignatureRecord2> record) {
		this.record = Objects.requireNonNull(record);
		return this;
	}

	public Max64Text getRandomBlock() {
		return randomBlock;
	}

	public IsabelSignature3 setRandomBlock(Max64Text randomBlock) {
		this.randomBlock = Objects.requireNonNull(randomBlock);
		return this;
	}
}