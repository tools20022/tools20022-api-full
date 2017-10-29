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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.PartyIdentification23Choice;
import com.tools20022.repository.choice.PartyIdentification24Choice;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msg.DocumentIdentification9;
import com.tools20022.repository.msg.TransactionDetails2;
import com.tools20022.repository.msg.TransactionDetails3;
import com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * A reporting institution, eg, an investment bank, sends the
 * RegulatoryTransactionReportCancellationRequest to a regulator or to an
 * intermediary (eg a reporting agent), to request a cancellation of a
 * previously sent RegulatoryTransactionReport.<br>
 * <b>Usage</b><br>
 * The message definition can be used to cancel an entire
 * RegulatoryTransactionReport or to cancel one or more individual transactions
 * in a previously sent RegulatoryTransactionReport.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive
 * TransactionRegulatoryReportingISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RgltryTxRptCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule
 * RegulatoryTransactionReportCancellationRequestV02.
 * CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#Identification
 * RegulatoryTransactionReportCancellationRequestV02.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#ReportingInstitution
 * RegulatoryTransactionReportCancellationRequestV02.ReportingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#ReportingAgent
 * RegulatoryTransactionReportCancellationRequestV02.ReportingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#CancellationByTransactionDetails
 * RegulatoryTransactionReportCancellationRequestV02.
 * CancellationByTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#PreviousReference
 * RegulatoryTransactionReportCancellationRequestV02.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#CancellationByTradeReference
 * RegulatoryTransactionReportCancellationRequestV02.
 * CancellationByTradeReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#identifier
 * RegulatoryTransactionReportCancellationRequestV02.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegulatoryTransactionReportCancellationRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA reporting institution, eg, an investment bank, sends the RegulatoryTransactionReportCancellationRequest to a regulator or to an intermediary (eg a reporting agent), to request a cancellation of a previously sent RegulatoryTransactionReport.\r\nUsage\r\nThe message definition can be used to cancel an entire RegulatoryTransactionReport or to cancel one or more individual transactions in a previously sent RegulatoryTransactionReport."
 * </li>
 * </ul>
 */
public class RegulatoryTransactionReportCancellationRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either PreviousReference or one or more instances of
	 * CancellationByTransactionDetails or one or more instances of
	 * CancellationByTradeReference must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#CancellationByTransactionDetails
	 * RegulatoryTransactionReportCancellationRequestV02.
	 * CancellationByTransactionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#PreviousReference
	 * RegulatoryTransactionReportCancellationRequestV02.PreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#CancellationByTradeReference
	 * RegulatoryTransactionReportCancellationRequestV02.
	 * CancellationByTradeReference}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02
	 * RegulatoryTransactionReportCancellationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either PreviousReference or one or more instances of CancellationByTransactionDetails or one or more instances of CancellationByTradeReference must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule";
			definition = "Either PreviousReference or one or more instances of CancellationByTransactionDetails or one or more instances of CancellationByTradeReference must be present.";
			messageDefinition_lazy = () -> RegulatoryTransactionReportCancellationRequestV02.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays
					.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.CancellationByTransactionDetails,
							com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.PreviousReference,
							com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.CancellationByTradeReference);
		}
	};
	/**
	 * Identification of the RegulatoryTransactionReportCancellationRequest
	 * document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the RegulatoryTransactionReportCancellationRequest document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Identification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the RegulatoryTransactionReportCancellationRequest document.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	/**
	 * Identification of the firm that executed the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification23Choice
	 * PartyIdentification23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgInstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the firm that executed the transaction.\n"</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ReportingInstitution = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptgInstn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingInstitution";
			definition = "Identification of the firm that executed the transaction.\n";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> PartyIdentification23Choice.mmObject();
		}
	};
	/**
	 * Identifies the intermediary which is reporting on behalf on the reporting
	 * institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification24Choice
	 * PartyIdentification24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the intermediary which is reporting on behalf on the reporting institution. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock ReportingAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptgAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingAgent";
			definition = "Identifies the intermediary which is reporting on behalf on the reporting institution. ";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PartyIdentification24Choice.mmObject();
		}
	};
	/**
	 * Provides all the details of the transaction report that needs to be
	 * cancelled. More than one set of details can be provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails3
	 * TransactionDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByTxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByTransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides all the details of the transaction report that needs to be cancelled. More than one set of details can be provided.\n\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CancellationByTransactionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlByTxDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByTransactionDetails";
			definition = "Provides all the details of the transaction report that needs to be cancelled. More than one set of details can be provided.\n\n";
			minOccurs = 1;
			complexType_lazy = () -> TransactionDetails3.mmObject();
		}
	};
	/**
	 * Provides the reference of the RegulatoryTransactionReport document that
	 * was previously sent and that needs to be cancelled in its entirety.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification9
	 * DocumentIdentification9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the reference of the RegulatoryTransactionReport document that was previously sent and that needs to be cancelled in its entirety."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock PreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Provides the reference of the RegulatoryTransactionReport document that was previously sent and that needs to be cancelled in its entirety.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}
	};
	/**
	 * Provides the trade reference of the transaction report that needs to be
	 * cancelled. More than one reference may be provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails2
	 * TransactionDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByTradRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByTradeReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the trade reference of the transaction report that needs to be cancelled. More than one reference may be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CancellationByTradeReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlByTradRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByTradeReference";
			definition = "Provides the trade reference of the transaction report that needs to be cancelled. More than one reference may be provided.";
			minOccurs = 1;
			complexType_lazy = () -> TransactionDetails2.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "02"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "auth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "009"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "auth";
			messageFunctionality = "009";
			version = "02";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RegulatoryTransactionReportCancellationRequestV02";
				definition = "Scope\r\nA reporting institution, eg, an investment bank, sends the RegulatoryTransactionReportCancellationRequest to a regulator or to an intermediary (eg a reporting agent), to request a cancellation of a previously sent RegulatoryTransactionReport.\r\nUsage\r\nThe message definition can be used to cancel an entire RegulatoryTransactionReport or to cancel one or more individual transactions in a previously sent RegulatoryTransactionReport.";
				messageSet_lazy = () -> Arrays.asList(TransactionRegulatoryReportingISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule);
				rootElement = "Document";
				xmlTag = "RgltryTxRptCxlReq";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.Identification,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.ReportingInstitution, com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.ReportingAgent,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.CancellationByTransactionDetails,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.PreviousReference,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.CancellationByTradeReference);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}