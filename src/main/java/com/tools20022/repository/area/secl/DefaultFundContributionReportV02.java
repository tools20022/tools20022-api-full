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

package com.tools20022.repository.area.secl;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesClearingLatestVersion;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.msg.DefaultFundReport1;
import com.tools20022.repository.msg.ReportParameters2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The DefaultFundContributionReport message is sent by the central counterparty
 * (CCP) to a Clearing member to report on the calculation of the default fund
 * contribution and the potential net excess or deficit.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * CCPs require participants to post assets in a clearing fund that can be used
 * in the event of a default by a participant, to compensate non-defaulting
 * participants for losses they suffer due to this default. The CCP evaluates
 * each participant risk level based on their positions (monthly or daily) and
 * calculate the excess of deficit of the default fund contribution. The
 * DefaultFundContributionReport is usually sent on a monthly basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.DefaultFundContributionReportV02#mmReportParameters
 * DefaultFundContributionReportV02.mmReportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.DefaultFundContributionReportV02#mmClearingMember
 * DefaultFundContributionReportV02.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.DefaultFundContributionReportV02#mmReportDetails
 * DefaultFundContributionReportV02.mmReportDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.DefaultFundContributionReportV02#mmSupplementaryData
 * DefaultFundContributionReportV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion
 * CentralCounterPartyCCPSecuritiesClearingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DfltFndCntrbtnRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesClearingLatestVersion
 * SecuritiesClearingLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code secl.006.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DefaultFundContributionReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe DefaultFundContributionReport message is sent by the central counterparty (CCP) to a Clearing member to report on the calculation of the default fund contribution and the potential net excess or deficit.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nCCPs require participants to post assets in a clearing fund that can be used in the event of a default by a participant, to compensate non-defaulting participants for losses they suffer due to this default. The CCP evaluates each participant risk level based on their positions (monthly or daily) and calculate the excess of deficit of the default fund contribution. The DefaultFundContributionReport is usually sent on a monthly basis."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DefaultFundContributionReportV02", propOrder = {"reportParameters", "clearingMember", "reportDetails", "supplementaryData"})
public class DefaultFundContributionReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptParams", required = true)
	protected ReportParameters2 reportParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters2
	 * ReportParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the report such as the report identification, the calculation date, the value date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameters";
			definition = "Provides details about the report such as the report identification, the calculation date, the value date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportParameters2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DefaultFundContributionReportV02.class.getMethod("getReportParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ClrMmb", required = true)
	protected PartyIdentification35Choice clearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClearingMember = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DefaultFundContributionReportV02.class.getMethod("getClearingMember", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RptDtls", required = true)
	protected List<DefaultFundReport1> reportDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DefaultFundReport1
	 * DefaultFundReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the default fund report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportDetails";
			definition = "Provides details on the default fund report.";
			minOccurs = 1;
			complexType_lazy = () -> DefaultFundReport1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DefaultFundContributionReportV02.class.getMethod("getReportDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DefaultFundContributionReportV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DefaultFundContributionReportV02";
				definition = "Scope\r\nThe DefaultFundContributionReport message is sent by the central counterparty (CCP) to a Clearing member to report on the calculation of the default fund contribution and the potential net excess or deficit.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nCCPs require participants to post assets in a clearing fund that can be used in the event of a default by a participant, to compensate non-defaulting participants for losses they suffer due to this default. The CCP evaluates each participant risk level based on their positions (monthly or daily) and calculate the excess of deficit of the default fund contribution. The DefaultFundContributionReport is usually sent on a monthly basis.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPSecuritiesClearingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "DfltFndCntrbtnRpt";
				businessArea_lazy = () -> SecuritiesClearingLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.secl.DefaultFundContributionReportV02.mmReportParameters, com.tools20022.repository.area.secl.DefaultFundContributionReportV02.mmClearingMember,
						com.tools20022.repository.area.secl.DefaultFundContributionReportV02.mmReportDetails, com.tools20022.repository.area.secl.DefaultFundContributionReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "secl";
						messageFunctionality = "006";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DefaultFundContributionReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ReportParameters2 getReportParameters() {
		return reportParameters;
	}

	public DefaultFundContributionReportV02 setReportParameters(ReportParameters2 reportParameters) {
		this.reportParameters = Objects.requireNonNull(reportParameters);
		return this;
	}

	public PartyIdentification35Choice getClearingMember() {
		return clearingMember;
	}

	public DefaultFundContributionReportV02 setClearingMember(PartyIdentification35Choice clearingMember) {
		this.clearingMember = Objects.requireNonNull(clearingMember);
		return this;
	}

	public List<DefaultFundReport1> getReportDetails() {
		return reportDetails == null ? reportDetails = new ArrayList<>() : reportDetails;
	}

	public DefaultFundContributionReportV02 setReportDetails(List<DefaultFundReport1> reportDetails) {
		this.reportDetails = Objects.requireNonNull(reportDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public DefaultFundContributionReportV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.006.001.02")
	static public class Document {
		@XmlElement(name = "DfltFndCntrbtnRpt", required = true)
		public DefaultFundContributionReportV02 messageBody;
	}
}