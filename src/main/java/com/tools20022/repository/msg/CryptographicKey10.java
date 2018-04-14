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
import com.tools20022.repository.choice.KeyChoiceValue1;
import com.tools20022.repository.codeset.CryptographicKeyType3Code;
import com.tools20022.repository.codeset.KeyUsage1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PublicRSAKey1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cryptographic key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey10#mmName
 * CryptographicKey10.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey10#mmIdentification
 * CryptographicKey10.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey10#mmSecurityDomainIdentification
 * CryptographicKey10.mmSecurityDomainIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey10#mmAdditionalIdentification
 * CryptographicKey10.mmAdditionalIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey10#mmVersion
 * CryptographicKey10.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey10#mmSequenceCounter
 * CryptographicKey10.mmSequenceCounter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey10#mmType
 * CryptographicKey10.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey10#mmFunction
 * CryptographicKey10.mmFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey10#mmActivationDate
 * CryptographicKey10.mmActivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey10#mmDeactivationDate
 * CryptographicKey10.mmDeactivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey10#mmKeyCheckValue
 * CryptographicKey10.mmKeyCheckValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey10#mmPublicKeyValue
 * CryptographicKey10.mmPublicKeyValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CryptographicKey10#mmKeyChoiceValue
 * CryptographicKey10.mmKeyChoiceValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CryptographicKey10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cryptographic key."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey12
 * CryptographicKey12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CryptographicKey8
 * CryptographicKey8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CryptographicKey10", propOrder = {"name", "identification", "securityDomainIdentification", "additionalIdentification", "version", "sequenceCounter", "type", "function", "activationDate", "deactivationDate",
		"keyCheckValue", "publicKeyValue", "keyChoiceValue"})
public class CryptographicKey10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm")
	protected Max140Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name or label of the key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey12#mmName
	 * CryptographicKey12.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmName
	 * CryptographicKey8.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<Max140Text>> mmName = new MMMessageAttribute<CryptographicKey10, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name or label of the key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmName);
			previousVersion_lazy = () -> CryptographicKey8.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(CryptographicKey10 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<Max140Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Id")
	protected Max140Text identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmIdentification
	 * CryptographicKey12.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmIdentification
	 * CryptographicKey8.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<Max140Text>> mmIdentification = new MMMessageAttribute<CryptographicKey10, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Name of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmIdentification);
			previousVersion_lazy = () -> CryptographicKey8.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(CryptographicKey10 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<Max140Text> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyDomnId")
	protected Max35Text securityDomainIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyDomnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDomainIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the security domain."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmSecurityDomainIdentification
	 * CryptographicKey12.mmSecurityDomainIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmSecurityDomainIdentification
	 * CryptographicKey8.mmSecurityDomainIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<Max35Text>> mmSecurityDomainIdentification = new MMMessageAttribute<CryptographicKey10, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "SctyDomnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDomainIdentification";
			definition = "Identification of the security domain.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmSecurityDomainIdentification);
			previousVersion_lazy = () -> CryptographicKey8.mmSecurityDomainIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CryptographicKey10 obj) {
			return obj.getSecurityDomainIdentification();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<Max35Text> value) {
			obj.setSecurityDomainIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlId")
	protected Max35Binary additionalIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional identification of the key, for instance to derive the key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmAdditionalIdentification
	 * CryptographicKey12.mmAdditionalIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmAdditionalIdentification
	 * CryptographicKey8.mmAdditionalIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<Max35Binary>> mmAdditionalIdentification = new MMMessageAttribute<CryptographicKey10, Optional<Max35Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "AddtlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalIdentification";
			definition = "Additional identification of the key, for instance to derive the key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmAdditionalIdentification);
			previousVersion_lazy = () -> CryptographicKey8.mmAdditionalIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}

		@Override
		public Optional<Max35Binary> getValue(CryptographicKey10 obj) {
			return obj.getAdditionalIdentification();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<Max35Binary> value) {
			obj.setAdditionalIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Vrsn")
	protected Max256Text version;
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
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmVersion
	 * CryptographicKey12.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmVersion
	 * CryptographicKey8.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<Max256Text>> mmVersion = new MMMessageAttribute<CryptographicKey10, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmVersion);
			previousVersion_lazy = () -> CryptographicKey8.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(CryptographicKey10 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<Max256Text> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "SeqCntr")
	protected Number sequenceCounter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeqCntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequence counter of the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmSequenceCounter
	 * CryptographicKey12.mmSequenceCounter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmSequenceCounter
	 * CryptographicKey8.mmSequenceCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<Number>> mmSequenceCounter = new MMMessageAttribute<CryptographicKey10, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "SeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceCounter";
			definition = "Sequence counter of the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmSequenceCounter);
			previousVersion_lazy = () -> CryptographicKey8.mmSequenceCounter;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(CryptographicKey10 obj) {
			return obj.getSequenceCounter();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<Number> value) {
			obj.setSequenceCounter(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected CryptographicKeyType3Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType3Code
	 * CryptographicKeyType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of algorithm used by the cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CryptographicKey12#mmType
	 * CryptographicKey12.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmType
	 * CryptographicKey8.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<CryptographicKeyType3Code>> mmType = new MMMessageAttribute<CryptographicKey10, Optional<CryptographicKeyType3Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of algorithm used by the cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmType);
			previousVersion_lazy = () -> CryptographicKey8.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CryptographicKeyType3Code.mmObject();
		}

		@Override
		public Optional<CryptographicKeyType3Code> getValue(CryptographicKey10 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<CryptographicKeyType3Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Fctn")
	protected List<KeyUsage1Code> function;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.KeyUsage1Code
	 * KeyUsage1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Function"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowed usage of the key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmFunction
	 * CryptographicKey12.mmFunction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmFunction
	 * CryptographicKey8.mmFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, List<KeyUsage1Code>> mmFunction = new MMMessageAttribute<CryptographicKey10, List<KeyUsage1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "Fctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Function";
			definition = "Allowed usage of the key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmFunction);
			previousVersion_lazy = () -> CryptographicKey8.mmFunction;
			minOccurs = 0;
			simpleType_lazy = () -> KeyUsage1Code.mmObject();
		}

		@Override
		public List<KeyUsage1Code> getValue(CryptographicKey10 obj) {
			return obj.getFunction();
		}

		@Override
		public void setValue(CryptographicKey10 obj, List<KeyUsage1Code> value) {
			obj.setFunction(value);
		}
	};
	@XmlElement(name = "ActvtnDt")
	protected ISODateTime activationDate;
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
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be activated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmActivationDate
	 * CryptographicKey12.mmActivationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmActivationDate
	 * CryptographicKey8.mmActivationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<ISODateTime>> mmActivationDate = new MMMessageAttribute<CryptographicKey10, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "ActvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivationDate";
			definition = "Date and time on which the key must be activated.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmActivationDate);
			previousVersion_lazy = () -> CryptographicKey8.mmActivationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CryptographicKey10 obj) {
			return obj.getActivationDate();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<ISODateTime> value) {
			obj.setActivationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DeactvtnDt")
	protected ISODateTime deactivationDate;
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
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DeactvtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time on which the key must be deactivated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmDeactivationDate
	 * CryptographicKey12.mmDeactivationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmDeactivationDate
	 * CryptographicKey8.mmDeactivationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<ISODateTime>> mmDeactivationDate = new MMMessageAttribute<CryptographicKey10, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "DeactvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivationDate";
			definition = "Date and time on which the key must be deactivated.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmDeactivationDate);
			previousVersion_lazy = () -> CryptographicKey8.mmDeactivationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CryptographicKey10 obj) {
			return obj.getDeactivationDate();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<ISODateTime> value) {
			obj.setDeactivationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "KeyChckVal")
	protected Max35Binary keyCheckValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyChckVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyCheckValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value for checking a cryptographic key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmKeyCheckValue
	 * CryptographicKey12.mmKeyCheckValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmKeyCheckValue
	 * CryptographicKey8.mmKeyCheckValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CryptographicKey10, Optional<Max35Binary>> mmKeyCheckValue = new MMMessageAttribute<CryptographicKey10, Optional<Max35Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "KeyChckVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyCheckValue";
			definition = "Value for checking a cryptographic key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmKeyCheckValue);
			previousVersion_lazy = () -> CryptographicKey8.mmKeyCheckValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}

		@Override
		public Optional<Max35Binary> getValue(CryptographicKey10 obj) {
			return obj.getKeyCheckValue();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<Max35Binary> value) {
			obj.setKeyCheckValue(value.orElse(null));
		}
	};
	@XmlElement(name = "PblcKeyVal")
	protected PublicRSAKey1 publicKeyValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PublicRSAKey1
	 * PublicRSAKey1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PblcKeyVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PublicKeyValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the public component of a RSA key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmPublicKeyValue
	 * CryptographicKey12.mmPublicKeyValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey8#mmPublicKeyValue
	 * CryptographicKey8.mmPublicKeyValue}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CryptographicKey10, Optional<PublicRSAKey1>> mmPublicKeyValue = new MMMessageAssociationEnd<CryptographicKey10, Optional<PublicRSAKey1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "PblcKeyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PublicKeyValue";
			definition = "Value of the public component of a RSA key.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmPublicKeyValue);
			previousVersion_lazy = () -> CryptographicKey8.mmPublicKeyValue;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PublicRSAKey1.mmObject();
		}

		@Override
		public Optional<PublicRSAKey1> getValue(CryptographicKey10 obj) {
			return obj.getPublicKeyValue();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<PublicRSAKey1> value) {
			obj.setPublicKeyValue(value.orElse(null));
		}
	};
	@XmlElement(name = "KeyChcVal")
	protected KeyChoiceValue1 keyChoiceValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.KeyChoiceValue1
	 * KeyChoiceValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey10
	 * CryptographicKey10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyChcVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyChoiceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Element containing the key information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey12#mmKeyChoiceValue
	 * CryptographicKey12.mmKeyChoiceValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CryptographicKey10, Optional<KeyChoiceValue1>> mmKeyChoiceValue = new MMMessageAssociationEnd<CryptographicKey10, Optional<KeyChoiceValue1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CryptographicKey10.mmObject();
			isDerived = false;
			xmlTag = "KeyChcVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyChoiceValue";
			definition = "Element containing the key information.";
			nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmKeyChoiceValue);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KeyChoiceValue1.mmObject();
		}

		@Override
		public Optional<KeyChoiceValue1> getValue(CryptographicKey10 obj) {
			return obj.getKeyChoiceValue();
		}

		@Override
		public void setValue(CryptographicKey10 obj, Optional<KeyChoiceValue1> value) {
			obj.setKeyChoiceValue(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CryptographicKey10.mmName, com.tools20022.repository.msg.CryptographicKey10.mmIdentification,
						com.tools20022.repository.msg.CryptographicKey10.mmSecurityDomainIdentification, com.tools20022.repository.msg.CryptographicKey10.mmAdditionalIdentification,
						com.tools20022.repository.msg.CryptographicKey10.mmVersion, com.tools20022.repository.msg.CryptographicKey10.mmSequenceCounter, com.tools20022.repository.msg.CryptographicKey10.mmType,
						com.tools20022.repository.msg.CryptographicKey10.mmFunction, com.tools20022.repository.msg.CryptographicKey10.mmActivationDate, com.tools20022.repository.msg.CryptographicKey10.mmDeactivationDate,
						com.tools20022.repository.msg.CryptographicKey10.mmKeyCheckValue, com.tools20022.repository.msg.CryptographicKey10.mmPublicKeyValue, com.tools20022.repository.msg.CryptographicKey10.mmKeyChoiceValue);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CryptographicKey10";
				definition = "Cryptographic key.";
				nextVersions_lazy = () -> Arrays.asList(CryptographicKey12.mmObject());
				previousVersion_lazy = () -> CryptographicKey8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max140Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CryptographicKey10 setName(Max140Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max140Text> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public CryptographicKey10 setIdentification(Max140Text identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max35Text> getSecurityDomainIdentification() {
		return securityDomainIdentification == null ? Optional.empty() : Optional.of(securityDomainIdentification);
	}

	public CryptographicKey10 setSecurityDomainIdentification(Max35Text securityDomainIdentification) {
		this.securityDomainIdentification = securityDomainIdentification;
		return this;
	}

	public Optional<Max35Binary> getAdditionalIdentification() {
		return additionalIdentification == null ? Optional.empty() : Optional.of(additionalIdentification);
	}

	public CryptographicKey10 setAdditionalIdentification(Max35Binary additionalIdentification) {
		this.additionalIdentification = additionalIdentification;
		return this;
	}

	public Optional<Max256Text> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public CryptographicKey10 setVersion(Max256Text version) {
		this.version = version;
		return this;
	}

	public Optional<Number> getSequenceCounter() {
		return sequenceCounter == null ? Optional.empty() : Optional.of(sequenceCounter);
	}

	public CryptographicKey10 setSequenceCounter(Number sequenceCounter) {
		this.sequenceCounter = sequenceCounter;
		return this;
	}

	public Optional<CryptographicKeyType3Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CryptographicKey10 setType(CryptographicKeyType3Code type) {
		this.type = type;
		return this;
	}

	public List<KeyUsage1Code> getFunction() {
		return function == null ? function = new ArrayList<>() : function;
	}

	public CryptographicKey10 setFunction(List<KeyUsage1Code> function) {
		this.function = Objects.requireNonNull(function);
		return this;
	}

	public Optional<ISODateTime> getActivationDate() {
		return activationDate == null ? Optional.empty() : Optional.of(activationDate);
	}

	public CryptographicKey10 setActivationDate(ISODateTime activationDate) {
		this.activationDate = activationDate;
		return this;
	}

	public Optional<ISODateTime> getDeactivationDate() {
		return deactivationDate == null ? Optional.empty() : Optional.of(deactivationDate);
	}

	public CryptographicKey10 setDeactivationDate(ISODateTime deactivationDate) {
		this.deactivationDate = deactivationDate;
		return this;
	}

	public Optional<Max35Binary> getKeyCheckValue() {
		return keyCheckValue == null ? Optional.empty() : Optional.of(keyCheckValue);
	}

	public CryptographicKey10 setKeyCheckValue(Max35Binary keyCheckValue) {
		this.keyCheckValue = keyCheckValue;
		return this;
	}

	public Optional<PublicRSAKey1> getPublicKeyValue() {
		return publicKeyValue == null ? Optional.empty() : Optional.of(publicKeyValue);
	}

	public CryptographicKey10 setPublicKeyValue(PublicRSAKey1 publicKeyValue) {
		this.publicKeyValue = publicKeyValue;
		return this;
	}

	public Optional<KeyChoiceValue1> getKeyChoiceValue() {
		return keyChoiceValue == null ? Optional.empty() : Optional.of(keyChoiceValue);
	}

	public CryptographicKey10 setKeyChoiceValue(KeyChoiceValue1 keyChoiceValue) {
		this.keyChoiceValue = keyChoiceValue;
		return this;
	}
}