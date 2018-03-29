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

package com.tools20022.repository.area.supl;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SupplementaryDataLatestVersion;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.AccountAndParties2;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4;
import com.tools20022.repository.msgset.SupplementaryDataISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * This extends the message InformationRequestResponse.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.supl.InformationResponseSD1V01#mmInvestigationIdentification
 * InformationResponseSD1V01.mmInvestigationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.supl.InformationResponseSD1V01#mmCreationDateTime
 * InformationResponseSD1V01.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.supl.InformationResponseSD1V01#mmAccountServicerIdentification
 * InformationResponseSD1V01.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.supl.InformationResponseSD1V01#mmAccountAndParties
 * InformationResponseSD1V01.mmAccountAndParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SupplementaryDataISOLatestversion
 * SupplementaryDataISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InfRspnSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SupplementaryDataLatestVersion
 * SupplementaryDataLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code supl.027.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InformationResponseSD1V01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "This extends the message InformationRequestResponse."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InformationResponseSD1V01", propOrder = {"investigationIdentification", "creationDateTime", "accountServicerIdentification", "accountAndParties"})
public class InformationResponseSD1V01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvstgtnId", required = true)
	protected Max35Text investigationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstgtnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestigationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information used to identify the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InformationResponseSD1V01, Max35Text> mmInvestigationIdentification = new MMMessageBuildingBlock<InformationResponseSD1V01, Max35Text>() {
		{
			xmlTag = "InvstgtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestigationIdentification";
			definition = "Information used to identify the request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InformationResponseSD1V01 obj) {
			return obj.getInvestigationIdentification();
		}

		@Override
		public void setValue(InformationResponseSD1V01 obj, Max35Text value) {
			obj.setInvestigationIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of creation of the extension."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InformationResponseSD1V01, ISODateTime> mmCreationDateTime = new MMMessageBuildingBlock<InformationResponseSD1V01, ISODateTime>() {
		{
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time of creation of the extension.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(InformationResponseSD1V01 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(InformationResponseSD1V01 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "AcctSvcrId", required = true)
	protected BranchAndFinancialInstitutionIdentification4 accountServicerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the account servicing institution."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InformationResponseSD1V01, BranchAndFinancialInstitutionIdentification4> mmAccountServicerIdentification = new MMMessageBuildingBlock<InformationResponseSD1V01, BranchAndFinancialInstitutionIdentification4>() {
		{
			xmlTag = "AcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Identifies the account servicing institution.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification4 getValue(InformationResponseSD1V01 obj) {
			return obj.getAccountServicerIdentification();
		}

		@Override
		public void setValue(InformationResponseSD1V01 obj, BranchAndFinancialInstitutionIdentification4 value) {
			obj.setAccountServicerIdentification(value);
		}
	};
	@XmlElement(name = "AcctAndPties", required = true)
	protected List<AccountAndParties2> accountAndParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountAndParties2
	 * AccountAndParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctAndPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountAndParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested account and its owners."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InformationResponseSD1V01, List<AccountAndParties2>> mmAccountAndParties = new MMMessageBuildingBlock<InformationResponseSD1V01, List<AccountAndParties2>>() {
		{
			xmlTag = "AcctAndPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountAndParties";
			definition = "Requested account and its owners.";
			minOccurs = 1;
			complexType_lazy = () -> AccountAndParties2.mmObject();
		}

		@Override
		public List<AccountAndParties2> getValue(InformationResponseSD1V01 obj) {
			return obj.getAccountAndParties();
		}

		@Override
		public void setValue(InformationResponseSD1V01 obj, List<AccountAndParties2> value) {
			obj.setAccountAndParties(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InformationResponseSD1V01";
				definition = "This extends the message InformationRequestResponse.";
				messageSet_lazy = () -> Arrays.asList(SupplementaryDataISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "InfRspnSD1";
				businessArea_lazy = () -> SupplementaryDataLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.supl.InformationResponseSD1V01.mmInvestigationIdentification, com.tools20022.repository.area.supl.InformationResponseSD1V01.mmCreationDateTime,
						com.tools20022.repository.area.supl.InformationResponseSD1V01.mmAccountServicerIdentification, com.tools20022.repository.area.supl.InformationResponseSD1V01.mmAccountAndParties);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "supl";
						messageFunctionality = "027";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InformationResponseSD1V01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getInvestigationIdentification() {
		return investigationIdentification;
	}

	public InformationResponseSD1V01 setInvestigationIdentification(Max35Text investigationIdentification) {
		this.investigationIdentification = Objects.requireNonNull(investigationIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public InformationResponseSD1V01 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return accountServicerIdentification;
	}

	public InformationResponseSD1V01 setAccountServicerIdentification(BranchAndFinancialInstitutionIdentification4 accountServicerIdentification) {
		this.accountServicerIdentification = Objects.requireNonNull(accountServicerIdentification);
		return this;
	}

	public List<AccountAndParties2> getAccountAndParties() {
		return accountAndParties == null ? accountAndParties = new ArrayList<>() : accountAndParties;
	}

	public InformationResponseSD1V01 setAccountAndParties(List<AccountAndParties2> accountAndParties) {
		this.accountAndParties = Objects.requireNonNull(accountAndParties);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.027.001.01")
	static public class Document {
		@XmlElement(name = "InfRspnSD1", required = true)
		public InformationResponseSD1V01 messageBody;
	}
}