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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.msg.ContractRegistration1;
import com.tools20022.repository.msg.CurrencyControlHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CrossBorderTransactionsCurrencyControlReportingISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The ContractRegistrationRequest message is sent by the reporting party to the
 * registration agent to initiate the registration of a new contract subject to
 * currency control.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.018.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationRequestV01#mmGroupHeader
 * ContractRegistrationRequestV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationRequestV01#mmContractRegistration
 * ContractRegistrationRequestV01.mmContractRegistration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.ContractRegistrationRequestV01#mmSupplementaryData
 * ContractRegistrationRequestV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CrossBorderTransactionsCurrencyControlReportingISOLatestversion
 * CrossBorderTransactionsCurrencyControlReportingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CtrctRegnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ContractRegistrationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ContractRegistrationRequest message is sent by the reporting party to the registration agent to initiate the registration of a new contract subject to currency control."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContractRegistrationRequestV01", propOrder = {"groupHeader", "contractRegistration", "supplementaryData"})
public class ContractRegistrationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected CurrencyControlHeader1 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader1
	 * CurrencyControlHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics shared by all individual items included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ContractRegistrationRequestV01, CurrencyControlHeader1> mmGroupHeader = new MMMessageBuildingBlock<ContractRegistrationRequestV01, CurrencyControlHeader1>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Characteristics shared by all individual items included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CurrencyControlHeader1.mmObject();
		}

		@Override
		public CurrencyControlHeader1 getValue(ContractRegistrationRequestV01 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(ContractRegistrationRequestV01 obj, CurrencyControlHeader1 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "CtrctRegn", required = true)
	protected List<ContractRegistration1> contractRegistration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContractRegistration1
	 * ContractRegistration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctRegn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractRegistration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the currency control contract details for which the registration is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ContractRegistrationRequestV01, List<ContractRegistration1>> mmContractRegistration = new MMMessageBuildingBlock<ContractRegistrationRequestV01, List<ContractRegistration1>>() {
		{
			xmlTag = "CtrctRegn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractRegistration";
			definition = "Identifies the currency control contract details for which the registration is requested.";
			minOccurs = 1;
			complexType_lazy = () -> ContractRegistration1.mmObject();
		}

		@Override
		public List<ContractRegistration1> getValue(ContractRegistrationRequestV01 obj) {
			return obj.getContractRegistration();
		}

		@Override
		public void setValue(ContractRegistrationRequestV01 obj, List<ContractRegistration1> value) {
			obj.setContractRegistration(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ContractRegistrationRequestV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ContractRegistrationRequestV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ContractRegistrationRequestV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ContractRegistrationRequestV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContractRegistrationRequestV01";
				definition = "The ContractRegistrationRequest message is sent by the reporting party to the registration agent to initiate the registration of a new contract subject to currency control.";
				messageSet_lazy = () -> Arrays.asList(CrossBorderTransactionsCurrencyControlReportingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CtrctRegnReq";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.ContractRegistrationRequestV01.mmGroupHeader, com.tools20022.repository.area.auth.ContractRegistrationRequestV01.mmContractRegistration,
						com.tools20022.repository.area.auth.ContractRegistrationRequestV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "018";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ContractRegistrationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyControlHeader1 getGroupHeader() {
		return groupHeader;
	}

	public ContractRegistrationRequestV01 setGroupHeader(CurrencyControlHeader1 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<ContractRegistration1> getContractRegistration() {
		return contractRegistration == null ? contractRegistration = new ArrayList<>() : contractRegistration;
	}

	public ContractRegistrationRequestV01 setContractRegistration(List<ContractRegistration1> contractRegistration) {
		this.contractRegistration = Objects.requireNonNull(contractRegistration);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ContractRegistrationRequestV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.018.001.01")
	static public class Document {
		@XmlElement(name = "CtrctRegnReq", required = true)
		public ContractRegistrationRequestV01 messageBody;
	}
}