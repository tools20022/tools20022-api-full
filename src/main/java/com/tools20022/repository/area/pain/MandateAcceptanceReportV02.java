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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsInitiationArchive;
import com.tools20022.repository.msg.GroupHeader47;
import com.tools20022.repository.msg.MandateAcceptance2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MandateAcceptanceReport message is sent from the agent of the receiver
 * (debtor or creditor) of the MandateRequest message (initiation, amendment or
 * cancellation) to the agent of the initiator of the MandateRequest message
 * (debtor or creditor).<br>
 * A MandateAcceptanceReport message is used to confirm the acceptance or
 * rejection of a MandateRequest message. Where acceptance is part of the full
 * process flow, a MandateRequest message only becomes valid after a
 * confirmation of acceptance is received through a MandateAcceptanceReport
 * message from the agent of the receiver.<br>
 * <b>Usage</b><br>
 * The MandateAcceptanceReport message can contain only one confirmation of
 * acceptance of rejection of one specific MandateRequest message.<br>
 * The messages can be exchanged between debtor agent and creditor agent and
 * between debtor agent and debtor and creditor agent and creditor.<br>
 * The MandateAcceptanceReport message can be used in domestic and cross-border
 * scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MndtAccptncRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV02#mmGroupHeader
 * MandateAcceptanceReportV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV02#mmUnderlyingAcceptanceDetails
 * MandateAcceptanceReportV02.mmUnderlyingAcceptanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV02#mmSupplementaryData
 * MandateAcceptanceReportV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.012.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateAcceptanceReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MandateAcceptanceReport message is sent from the agent of the receiver (debtor or creditor) of the MandateRequest message (initiation, amendment or cancellation) to the agent of the initiator of the MandateRequest message (debtor or creditor).\r\nA MandateAcceptanceReport message is used to confirm the acceptance or rejection of a MandateRequest message. Where acceptance is part of the full process flow, a MandateRequest message only becomes valid after a confirmation of acceptance is received through a MandateAcceptanceReport message from the agent of the receiver.\r\nUsage\r\nThe MandateAcceptanceReport message can contain only one confirmation of acceptance of rejection of one specific MandateRequest message.\r\nThe messages can be exchanged between debtor agent and creditor agent and between debtor agent and debtor and creditor agent and creditor.\r\nThe MandateAcceptanceReport message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV03
 * MandateAcceptanceReportV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV01
 * MandateAcceptanceReportV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MandateAcceptanceReportV02", propOrder = {"groupHeader", "underlyingAcceptanceDetails", "supplementaryData"})
public class MandateAcceptanceReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader47 groupHeader;
	/**
	 * Set of characteristics to identify the message and parties playing a role
	 * in the mandate acceptance, but which are not part of the mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader47
	 * GroupHeader47}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics to identify the message and parties playing a role in the mandate acceptance, but which are not part of the mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics to identify the message and parties playing a role in the mandate acceptance, but which are not part of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader47.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MandateAcceptanceReportV02.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MandateAcceptance2 underlyingAcceptanceDetails;
	/**
	 * Set of elements used to provide information on the acception or rejection
	 * of the mandate request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance2
	 * MandateAcceptance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygAccptncDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingAcceptanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the acception or rejection of the mandate request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUnderlyingAcceptanceDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UndrlygAccptncDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingAcceptanceDetails";
			definition = "Set of elements used to provide information on the acception or rejection of the mandate request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MandateAcceptance2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MandateAcceptanceReportV02.class.getMethod("getUnderlyingAcceptanceDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MandateAcceptanceReportV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateAcceptanceReportV02";
				definition = "Scope\r\nThe MandateAcceptanceReport message is sent from the agent of the receiver (debtor or creditor) of the MandateRequest message (initiation, amendment or cancellation) to the agent of the initiator of the MandateRequest message (debtor or creditor).\r\nA MandateAcceptanceReport message is used to confirm the acceptance or rejection of a MandateRequest message. Where acceptance is part of the full process flow, a MandateRequest message only becomes valid after a confirmation of acceptance is received through a MandateAcceptanceReport message from the agent of the receiver.\r\nUsage\r\nThe MandateAcceptanceReport message can contain only one confirmation of acceptance of rejection of one specific MandateRequest message.\r\nThe messages can be exchanged between debtor agent and creditor agent and between debtor agent and debtor and creditor agent and creditor.\r\nThe MandateAcceptanceReport message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(MandateAcceptanceReportV03.mmObject());
				previousVersion_lazy = () -> MandateAcceptanceReportV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MndtAccptncRpt";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateAcceptanceReportV02.mmGroupHeader, com.tools20022.repository.area.pain.MandateAcceptanceReportV02.mmUnderlyingAcceptanceDetails,
						com.tools20022.repository.area.pain.MandateAcceptanceReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "012";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MandateAcceptanceReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public GroupHeader47 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader47 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "UndrlygAccptncDtls", required = true)
	public MandateAcceptance2 getUnderlyingAcceptanceDetails() {
		return underlyingAcceptanceDetails;
	}

	public void setUnderlyingAcceptanceDetails(MandateAcceptance2 underlyingAcceptanceDetails) {
		this.underlyingAcceptanceDetails = underlyingAcceptanceDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:pain.012.02.02")
	static public class Document {
		@XmlElement(name = "MndtAccptncRpt", required = true)
		public MandateAcceptanceReportV02 messageBody;
	}
}