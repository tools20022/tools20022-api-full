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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.PartyIdentification23Choice;
import com.tools20022.repository.choice.PartyIdentification24Choice;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msg.DocumentIdentification9;
import com.tools20022.repository.msg.TransactionDetails2;
import com.tools20022.repository.msg.TransactionDetails3;
import com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule
 * RegulatoryTransactionReportCancellationRequestV02.
 * CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmIdentification
 * RegulatoryTransactionReportCancellationRequestV02.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmReportingInstitution
 * RegulatoryTransactionReportCancellationRequestV02.mmReportingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmReportingAgent
 * RegulatoryTransactionReportCancellationRequestV02.mmReportingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmCancellationByTransactionDetails
 * RegulatoryTransactionReportCancellationRequestV02.
 * mmCancellationByTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmPreviousReference
 * RegulatoryTransactionReportCancellationRequestV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmCancellationByTradeReference
 * RegulatoryTransactionReportCancellationRequestV02.
 * mmCancellationByTradeReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive
 * TransactionRegulatoryReportingISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RgltryTxRptCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.009.001.02}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegulatoryTransactionReportCancellationRequestV02", propOrder = {"identification", "reportingInstitution", "reportingAgent", "cancellationByTransactionDetails", "previousReference", "cancellationByTradeReference"})
public class RegulatoryTransactionReportCancellationRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either PreviousReference or one or more instances of
	 * CancellationByTransactionDetails or one or more instances of
	 * CancellationByTradeReference must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02
	 * RegulatoryTransactionReportCancellationRequestV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmCancellationByTransactionDetails
	 * RegulatoryTransactionReportCancellationRequestV02.
	 * mmCancellationByTransactionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmPreviousReference
	 * RegulatoryTransactionReportCancellationRequestV02.mmPreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02#mmCancellationByTradeReference
	 * RegulatoryTransactionReportCancellationRequestV02.
	 * mmCancellationByTradeReference}</li>
	 * </ul>
	 * </li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule";
			definition = "Either PreviousReference or one or more instances of CancellationByTransactionDetails or one or more instances of CancellationByTradeReference must be present.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmCancellationByTransactionDetails,
					com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmPreviousReference,
					com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmCancellationByTradeReference);
			messageDefinition_lazy = () -> com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmObject();
		}
	};
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification8 identification;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, DocumentIdentification8>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the RegulatoryTransactionReportCancellationRequest document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(RegulatoryTransactionReportCancellationRequestV02 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationRequestV02 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "RptgInstn", required = true)
	protected PartyIdentification23Choice reportingInstitution;
	/**
	 * 
	 <p>
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
	 * "Identification of the firm that executed the transaction.\n."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, PartyIdentification23Choice> mmReportingInstitution = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, PartyIdentification23Choice>() {
		{
			xmlTag = "RptgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingInstitution";
			definition = "Identification of the firm that executed the transaction.\n.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification23Choice.mmObject();
		}

		@Override
		public PartyIdentification23Choice getValue(RegulatoryTransactionReportCancellationRequestV02 obj) {
			return obj.getReportingInstitution();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationRequestV02 obj, PartyIdentification23Choice value) {
			obj.setReportingInstitution(value);
		}
	};
	@XmlElement(name = "RptgAgt")
	protected PartyIdentification24Choice reportingAgent;
	/**
	 * 
	 <p>
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
	 * "Identifies the intermediary which is reporting on behalf on the reporting institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, Optional<PartyIdentification24Choice>> mmReportingAgent = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, Optional<PartyIdentification24Choice>>() {
		{
			xmlTag = "RptgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingAgent";
			definition = "Identifies the intermediary which is reporting on behalf on the reporting institution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification24Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification24Choice> getValue(RegulatoryTransactionReportCancellationRequestV02 obj) {
			return obj.getReportingAgent();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationRequestV02 obj, Optional<PartyIdentification24Choice> value) {
			obj.setReportingAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlByTxDtls", required = true)
	protected List<TransactionDetails3> cancellationByTransactionDetails;
	/**
	 * 
	 <p>
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
	 * "Provides all the details of the transaction report that needs to be cancelled. More than one set of details can be provided.\n\n."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, List<TransactionDetails3>> mmCancellationByTransactionDetails = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, List<TransactionDetails3>>() {
		{
			xmlTag = "CxlByTxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByTransactionDetails";
			definition = "Provides all the details of the transaction report that needs to be cancelled. More than one set of details can be provided.\n\n.";
			minOccurs = 1;
			complexType_lazy = () -> TransactionDetails3.mmObject();
		}

		@Override
		public List<TransactionDetails3> getValue(RegulatoryTransactionReportCancellationRequestV02 obj) {
			return obj.getCancellationByTransactionDetails();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationRequestV02 obj, List<TransactionDetails3> value) {
			obj.setCancellationByTransactionDetails(value);
		}
	};
	@XmlElement(name = "PrvsRef", required = true)
	protected DocumentIdentification9 previousReference;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, DocumentIdentification9> mmPreviousReference = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, DocumentIdentification9>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Provides the reference of the RegulatoryTransactionReport document that was previously sent and that needs to be cancelled in its entirety.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification9.mmObject();
		}

		@Override
		public DocumentIdentification9 getValue(RegulatoryTransactionReportCancellationRequestV02 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationRequestV02 obj, DocumentIdentification9 value) {
			obj.setPreviousReference(value);
		}
	};
	@XmlElement(name = "CxlByTradRef", required = true)
	protected List<TransactionDetails2> cancellationByTradeReference;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, List<TransactionDetails2>> mmCancellationByTradeReference = new MMMessageBuildingBlock<RegulatoryTransactionReportCancellationRequestV02, List<TransactionDetails2>>() {
		{
			xmlTag = "CxlByTradRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByTradeReference";
			definition = "Provides the trade reference of the transaction report that needs to be cancelled. More than one reference may be provided.";
			minOccurs = 1;
			complexType_lazy = () -> TransactionDetails2.mmObject();
		}

		@Override
		public List<TransactionDetails2> getValue(RegulatoryTransactionReportCancellationRequestV02 obj) {
			return obj.getCancellationByTradeReference();
		}

		@Override
		public void setValue(RegulatoryTransactionReportCancellationRequestV02 obj, List<TransactionDetails2> value) {
			obj.setCancellationByTradeReference(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryTransactionReportCancellationRequestV02";
				definition = "Scope\r\nA reporting institution, eg, an investment bank, sends the RegulatoryTransactionReportCancellationRequest to a regulator or to an intermediary (eg a reporting agent), to request a cancellation of a previously sent RegulatoryTransactionReport.\r\nUsage\r\nThe message definition can be used to cancel an entire RegulatoryTransactionReport or to cancel one or more individual transactions in a previously sent RegulatoryTransactionReport.";
				messageSet_lazy = () -> Arrays.asList(TransactionRegulatoryReportingISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.CancellationByPreviousReferenceOrTradeReferenceOrTransactionDetailsRule);
				rootElement = "Document";
				xmlTag = "RgltryTxRptCxlReq";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmIdentification,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmReportingInstitution, com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmReportingAgent,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmCancellationByTransactionDetails,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmPreviousReference,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationRequestV02.mmCancellationByTradeReference);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "009";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RegulatoryTransactionReportCancellationRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public RegulatoryTransactionReportCancellationRequestV02 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public PartyIdentification23Choice getReportingInstitution() {
		return reportingInstitution;
	}

	public RegulatoryTransactionReportCancellationRequestV02 setReportingInstitution(PartyIdentification23Choice reportingInstitution) {
		this.reportingInstitution = Objects.requireNonNull(reportingInstitution);
		return this;
	}

	public Optional<PartyIdentification24Choice> getReportingAgent() {
		return reportingAgent == null ? Optional.empty() : Optional.of(reportingAgent);
	}

	public RegulatoryTransactionReportCancellationRequestV02 setReportingAgent(PartyIdentification24Choice reportingAgent) {
		this.reportingAgent = reportingAgent;
		return this;
	}

	public List<TransactionDetails3> getCancellationByTransactionDetails() {
		return cancellationByTransactionDetails == null ? cancellationByTransactionDetails = new ArrayList<>() : cancellationByTransactionDetails;
	}

	public RegulatoryTransactionReportCancellationRequestV02 setCancellationByTransactionDetails(List<TransactionDetails3> cancellationByTransactionDetails) {
		this.cancellationByTransactionDetails = Objects.requireNonNull(cancellationByTransactionDetails);
		return this;
	}

	public DocumentIdentification9 getPreviousReference() {
		return previousReference;
	}

	public RegulatoryTransactionReportCancellationRequestV02 setPreviousReference(DocumentIdentification9 previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public List<TransactionDetails2> getCancellationByTradeReference() {
		return cancellationByTradeReference == null ? cancellationByTradeReference = new ArrayList<>() : cancellationByTradeReference;
	}

	public RegulatoryTransactionReportCancellationRequestV02 setCancellationByTradeReference(List<TransactionDetails2> cancellationByTradeReference) {
		this.cancellationByTradeReference = Objects.requireNonNull(cancellationByTradeReference);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.009.001.02")
	static public class Document {
		@XmlElement(name = "RgltryTxRptCxlReq", required = true)
		public RegulatoryTransactionReportCancellationRequestV02 messageBody;
	}
}