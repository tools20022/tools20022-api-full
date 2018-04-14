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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMConfigurationParameter1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * ATM terminal equipment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment1#mmManufacturer
 * ATMEquipment1.mmManufacturer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment1#mmModel
 * ATMEquipment1.mmModel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment1#mmSerialNumber
 * ATMEquipment1.mmSerialNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmApplicationProvider
 * ATMEquipment1.mmApplicationProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmApplicationName
 * ATMEquipment1.mmApplicationName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmApplicationVersion
 * ATMEquipment1.mmApplicationVersion}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment1#mmApprovalNumber
 * ATMEquipment1.mmApprovalNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEquipment1#mmConfigurationParameter
 * ATMEquipment1.mmConfigurationParameter}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMEquipment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "ATM terminal equipment."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment2 ATMEquipment2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEquipment1", propOrder = {"manufacturer", "model", "serialNumber", "applicationProvider", "applicationName", "applicationVersion", "approvalNumber", "configurationParameter"})
public class ATMEquipment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Manfctr")
	protected Max35Text manufacturer;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1 ATMEquipment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Manfctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manufacturer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM Manufacturer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmManufacturer
	 * ATMEquipment2.mmManufacturer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment1, Optional<Max35Text>> mmManufacturer = new MMMessageAttribute<ATMEquipment1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment1.mmObject();
			isDerived = false;
			xmlTag = "Manfctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Manufacturer";
			definition = "ATM Manufacturer.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment2.mmManufacturer);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment1 obj) {
			return obj.getManufacturer();
		}

		@Override
		public void setValue(ATMEquipment1 obj, Optional<Max35Text> value) {
			obj.setManufacturer(value.orElse(null));
		}
	};
	@XmlElement(name = "Mdl")
	protected Max35Text model;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1 ATMEquipment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mdl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Model"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Model of ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEquipment2#mmModel
	 * ATMEquipment2.mmModel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment1, Optional<Max35Text>> mmModel = new MMMessageAttribute<ATMEquipment1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment1.mmObject();
			isDerived = false;
			xmlTag = "Mdl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Model";
			definition = "Model of ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment2.mmModel);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment1 obj) {
			return obj.getModel();
		}

		@Override
		public void setValue(ATMEquipment1 obj, Optional<Max35Text> value) {
			obj.setModel(value.orElse(null));
		}
	};
	@XmlElement(name = "SrlNb")
	protected Max35Text serialNumber;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1 ATMEquipment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Serial number of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmSerialNumber
	 * ATMEquipment2.mmSerialNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment1, Optional<Max35Text>> mmSerialNumber = new MMMessageAttribute<ATMEquipment1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment1.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Serial number of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment2.mmSerialNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment1 obj) {
			return obj.getSerialNumber();
		}

		@Override
		public void setValue(ATMEquipment1 obj, Optional<Max35Text> value) {
			obj.setSerialNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "ApplPrvdr")
	protected Max35Text applicationProvider;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1 ATMEquipment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplPrvdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provider of the ATM application software."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmFirmwareProvider
	 * ATMEquipment2.mmFirmwareProvider}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment1, Optional<Max35Text>> mmApplicationProvider = new MMMessageAttribute<ATMEquipment1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment1.mmObject();
			isDerived = false;
			xmlTag = "ApplPrvdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationProvider";
			definition = "Provider of the ATM application software.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment2.mmFirmwareProvider);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment1 obj) {
			return obj.getApplicationProvider();
		}

		@Override
		public void setValue(ATMEquipment1 obj, Optional<Max35Text> value) {
			obj.setApplicationProvider(value.orElse(null));
		}
	};
	@XmlElement(name = "ApplNm")
	protected Max35Text applicationName;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1 ATMEquipment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the software product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment1, Optional<Max35Text>> mmApplicationName = new MMMessageAttribute<ATMEquipment1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment1.mmObject();
			isDerived = false;
			xmlTag = "ApplNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationName";
			definition = "Name of the software product.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment1 obj) {
			return obj.getApplicationName();
		}

		@Override
		public void setValue(ATMEquipment1 obj, Optional<Max35Text> value) {
			obj.setApplicationName(value.orElse(null));
		}
	};
	@XmlElement(name = "ApplVrsn")
	protected Max35Text applicationVersion;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1 ATMEquipment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Current version of the software that might include the release number."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmFirmwareIdentification
	 * ATMEquipment2.mmFirmwareIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment1, Optional<Max35Text>> mmApplicationVersion = new MMMessageAttribute<ATMEquipment1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment1.mmObject();
			isDerived = false;
			xmlTag = "ApplVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationVersion";
			definition = "Current version of the software that might include the release number.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment2.mmFirmwareIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment1 obj) {
			return obj.getApplicationVersion();
		}

		@Override
		public void setValue(ATMEquipment1 obj, Optional<Max35Text> value) {
			obj.setApplicationVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "ApprvlNb")
	protected Max35Text approvalNumber;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1 ATMEquipment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApprvlNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApprovalNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique assessment number for the component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment2#mmFirmwareVersion
	 * ATMEquipment2.mmFirmwareVersion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEquipment1, Optional<Max35Text>> mmApprovalNumber = new MMMessageAttribute<ATMEquipment1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment1.mmObject();
			isDerived = false;
			xmlTag = "ApprvlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApprovalNumber";
			definition = "Unique assessment number for the component.";
			nextVersions_lazy = () -> Arrays.asList(ATMEquipment2.mmFirmwareVersion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEquipment1 obj) {
			return obj.getApprovalNumber();
		}

		@Override
		public void setValue(ATMEquipment1 obj, Optional<Max35Text> value) {
			obj.setApprovalNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CfgtnParam")
	protected List<ATMConfigurationParameter1> configurationParameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter1
	 * ATMConfigurationParameter1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEquipment1 ATMEquipment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CfgtnParam"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfigurationParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameter version."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEquipment1, List<ATMConfigurationParameter1>> mmConfigurationParameter = new MMMessageAssociationEnd<ATMEquipment1, List<ATMConfigurationParameter1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEquipment1.mmObject();
			isDerived = false;
			xmlTag = "CfgtnParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfigurationParameter";
			definition = "Configuration parameter version.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMConfigurationParameter1.mmObject();
		}

		@Override
		public List<ATMConfigurationParameter1> getValue(ATMEquipment1 obj) {
			return obj.getConfigurationParameter();
		}

		@Override
		public void setValue(ATMEquipment1 obj, List<ATMConfigurationParameter1> value) {
			obj.setConfigurationParameter(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEquipment1.mmManufacturer, com.tools20022.repository.msg.ATMEquipment1.mmModel, com.tools20022.repository.msg.ATMEquipment1.mmSerialNumber,
						com.tools20022.repository.msg.ATMEquipment1.mmApplicationProvider, com.tools20022.repository.msg.ATMEquipment1.mmApplicationName, com.tools20022.repository.msg.ATMEquipment1.mmApplicationVersion,
						com.tools20022.repository.msg.ATMEquipment1.mmApprovalNumber, com.tools20022.repository.msg.ATMEquipment1.mmConfigurationParameter);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEquipment1";
				definition = "ATM terminal equipment.";
				nextVersions_lazy = () -> Arrays.asList(ATMEquipment2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getManufacturer() {
		return manufacturer == null ? Optional.empty() : Optional.of(manufacturer);
	}

	public ATMEquipment1 setManufacturer(Max35Text manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	public Optional<Max35Text> getModel() {
		return model == null ? Optional.empty() : Optional.of(model);
	}

	public ATMEquipment1 setModel(Max35Text model) {
		this.model = model;
		return this;
	}

	public Optional<Max35Text> getSerialNumber() {
		return serialNumber == null ? Optional.empty() : Optional.of(serialNumber);
	}

	public ATMEquipment1 setSerialNumber(Max35Text serialNumber) {
		this.serialNumber = serialNumber;
		return this;
	}

	public Optional<Max35Text> getApplicationProvider() {
		return applicationProvider == null ? Optional.empty() : Optional.of(applicationProvider);
	}

	public ATMEquipment1 setApplicationProvider(Max35Text applicationProvider) {
		this.applicationProvider = applicationProvider;
		return this;
	}

	public Optional<Max35Text> getApplicationName() {
		return applicationName == null ? Optional.empty() : Optional.of(applicationName);
	}

	public ATMEquipment1 setApplicationName(Max35Text applicationName) {
		this.applicationName = applicationName;
		return this;
	}

	public Optional<Max35Text> getApplicationVersion() {
		return applicationVersion == null ? Optional.empty() : Optional.of(applicationVersion);
	}

	public ATMEquipment1 setApplicationVersion(Max35Text applicationVersion) {
		this.applicationVersion = applicationVersion;
		return this;
	}

	public Optional<Max35Text> getApprovalNumber() {
		return approvalNumber == null ? Optional.empty() : Optional.of(approvalNumber);
	}

	public ATMEquipment1 setApprovalNumber(Max35Text approvalNumber) {
		this.approvalNumber = approvalNumber;
		return this;
	}

	public List<ATMConfigurationParameter1> getConfigurationParameter() {
		return configurationParameter == null ? configurationParameter = new ArrayList<>() : configurationParameter;
	}

	public ATMEquipment1 setConfigurationParameter(List<ATMConfigurationParameter1> configurationParameter) {
		this.configurationParameter = Objects.requireNonNull(configurationParameter);
		return this;
	}
}