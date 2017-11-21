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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.tsin.UndertakingApplicationV01;
import com.tools20022.repository.area.tsrv.*;
import com.tools20022.repository.entity.ElectronicSignature;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Entity involved in an activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2#mmParty
 * PartyAndSignature2.mmParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2#mmSignature
 * PartyAndSignature2.mmSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ElectronicSignature
 * ElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountAdditionalInformationRequestV02#mmDigitalSignature
 * AccountAdditionalInformationRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAdditionalInformationRequestV02#mmDigitalSignature
 * AccountClosingAdditionalInformationRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingAmendmentRequestV02#mmDigitalSignature
 * AccountClosingAmendmentRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02#mmDigitalSignature
 * AccountClosingRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceAmendmentRequestV02#mmDigitalSignature
 * AccountExcludedMandateMaintenanceAmendmentRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountExcludedMandateMaintenanceRequestV02#mmDigitalSignature
 * AccountExcludedMandateMaintenanceRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmDigitalSignature
 * AccountMandateMaintenanceAmendmentRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceRequestV02#mmDigitalSignature
 * AccountMandateMaintenanceRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAdditionalInformationRequestV02#mmDigitalSignature
 * AccountOpeningAdditionalInformationRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02#mmDigitalSignature
 * AccountOpeningAmendmentRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningRequestV02#mmDigitalSignature
 * AccountOpeningRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportRequestV02#mmDigitalSignature
 * AccountReportRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountReportV02#mmDigitalSignature
 * AccountReportV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestAcknowledgementV02#mmDigitalSignature
 * AccountRequestAcknowledgementV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountRequestRejectionV02#mmDigitalSignature
 * AccountRequestRejectionV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.DemandRefusalNotificationV01#mmDigitalSignature
 * DemandRefusalNotificationV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.DemandWithdrawalNotificationV01#mmDigitalSignature
 * DemandWithdrawalNotificationV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayRequestV01#mmDigitalSignature
 * ExtendOrPayRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.ExtendOrPayResponseV01#mmDigitalSignature
 * ExtendOrPayResponseV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.TradeStatusReportV01#mmDigitalSignature
 * TradeStatusReportV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01#mmDigitalSignature
 * UndertakingAmendmentAdviceV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentNotificationV01#mmDigitalSignature
 * UndertakingAmendmentNotificationV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentRequestV01#mmDigitalSignature
 * UndertakingAmendmentRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseNotificationV01#mmDigitalSignature
 * UndertakingAmendmentResponseNotificationV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseV01#mmDigitalSignature
 * UndertakingAmendmentResponseV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentV01#mmDigitalSignature
 * UndertakingAmendmentV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.UndertakingApplicationV01#mmDigitalSignature
 * UndertakingApplicationV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingDemandV01#mmDigitalSignature
 * UndertakingDemandV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01#mmDigitalSignature
 * UndertakingIssuanceAdviceV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceNotificationV01#mmDigitalSignature
 * UndertakingIssuanceNotificationV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceV01#mmDigitalSignature
 * UndertakingIssuanceV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingNonExtensionNotificationV01#mmDigitalSignature
 * UndertakingNonExtensionNotificationV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingNonExtensionRequestV01#mmDigitalSignature
 * UndertakingNonExtensionRequestV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingStatusReportV01#mmDigitalSignature
 * UndertakingStatusReportV01.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingTerminationNotificationV01#mmDigitalSignature
 * UndertakingTerminationNotificationV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyAndSignature2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Entity involved in an activity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PartyAndSignature2", propOrder = {"party", "signature"})
public class PartyAndSignature2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification43 party;
	/**
	 * Entity involved in an activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity involved in an activity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> PartyAndSignature2.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Entity involved in an activity.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected ProprietaryData3 signature;
	/**
	 * Signature of a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryData3
	 * ProprietaryData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Signature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signature of a party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSignature = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicSignature.mmObject();
			componentContext_lazy = () -> PartyAndSignature2.mmObject();
			isDerived = false;
			xmlTag = "Sgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Signature";
			definition = "Signature of a party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProprietaryData3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PartyAndSignature2.mmParty, PartyAndSignature2.mmSignature);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountAdditionalInformationRequestV02.mmDigitalSignature, AccountClosingAdditionalInformationRequestV02.mmDigitalSignature,
						AccountClosingAmendmentRequestV02.mmDigitalSignature, AccountClosingRequestV02.mmDigitalSignature, AccountExcludedMandateMaintenanceAmendmentRequestV02.mmDigitalSignature,
						AccountExcludedMandateMaintenanceRequestV02.mmDigitalSignature, AccountMandateMaintenanceAmendmentRequestV02.mmDigitalSignature, AccountMandateMaintenanceRequestV02.mmDigitalSignature,
						AccountOpeningAdditionalInformationRequestV02.mmDigitalSignature, AccountOpeningAmendmentRequestV02.mmDigitalSignature, AccountOpeningRequestV02.mmDigitalSignature, AccountReportRequestV02.mmDigitalSignature,
						AccountReportV02.mmDigitalSignature, AccountRequestAcknowledgementV02.mmDigitalSignature, AccountRequestRejectionV02.mmDigitalSignature, DemandRefusalNotificationV01.mmDigitalSignature,
						DemandWithdrawalNotificationV01.mmDigitalSignature, ExtendOrPayRequestV01.mmDigitalSignature, ExtendOrPayResponseV01.mmDigitalSignature, TradeStatusReportV01.mmDigitalSignature,
						UndertakingAmendmentAdviceV01.mmDigitalSignature, UndertakingAmendmentNotificationV01.mmDigitalSignature, UndertakingAmendmentRequestV01.mmDigitalSignature,
						UndertakingAmendmentResponseNotificationV01.mmDigitalSignature, UndertakingAmendmentResponseV01.mmDigitalSignature, UndertakingAmendmentV01.mmDigitalSignature, UndertakingApplicationV01.mmDigitalSignature,
						UndertakingDemandV01.mmDigitalSignature, UndertakingIssuanceAdviceV01.mmDigitalSignature, UndertakingIssuanceNotificationV01.mmDigitalSignature, UndertakingIssuanceV01.mmDigitalSignature,
						UndertakingNonExtensionNotificationV01.mmDigitalSignature, UndertakingNonExtensionRequestV01.mmDigitalSignature, UndertakingStatusReportV01.mmDigitalSignature,
						UndertakingTerminationNotificationV01.mmDigitalSignature);
				trace_lazy = () -> ElectronicSignature.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartyAndSignature2";
				definition = "Entity involved in an activity.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Pty", required = true)
	public PartyIdentification43 getParty() {
		return party;
	}

	public void setParty(com.tools20022.repository.msg.PartyIdentification43 party) {
		this.party = party;
	}

	@XmlElement(name = "Sgntr", required = true)
	public ProprietaryData3 getSignature() {
		return signature;
	}

	public void setSignature(com.tools20022.repository.msg.ProprietaryData3 signature) {
		this.signature = signature;
	}
}