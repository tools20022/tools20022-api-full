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
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.entity.SecuritiesSettlementSystem;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#mmDelivererDetails
 * DeliveringPartiesAndAccount9.mmDelivererDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#mmDeliverersCustodianDetails
 * DeliveringPartiesAndAccount9.mmDeliverersCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#mmDeliverersIntermediaryDetails
 * DeliveringPartiesAndAccount9.mmDeliverersIntermediaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#mmDeliveringAgentDetails
 * DeliveringPartiesAndAccount9.mmDeliveringAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount9.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#mmPlaceOfSettlementDetails
 * DeliveringPartiesAndAccount9.mmPlaceOfSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount9
 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount9}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveringPartiesAndAccount9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13
 * DeliveringPartiesAndAccount13}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8
 * DeliveringPartiesAndAccount8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeliveringPartiesAndAccount9", propOrder = {"delivererDetails", "deliverersCustodianDetails", "deliverersIntermediaryDetails", "deliveringAgentDetails", "securitiesSettlementSystem", "placeOfSettlementDetails"})
public class DeliveringPartiesAndAccount9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DlvrrDtls")
	protected InvestmentAccount41 delivererDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount41
	 * InvestmentAccount41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlementAccount
	 * SettlementPartyRole.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelivererDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDelivererDetails
	 * DeliveringPartiesAndAccount13.mmDelivererDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#mmDelivererDetails
	 * DeliveringPartiesAndAccount8.mmDelivererDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDelivererDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SettlementPartyRole.mmSettlementAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmObject();
			isDerived = false;
			xmlTag = "DlvrrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelivererDetails";
			definition = "Party that sells goods or services, or a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount13.mmDelivererDetails);
			previousVersion_lazy = () -> DeliveringPartiesAndAccount8.mmDelivererDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount41.mmObject();
		}
	};
	@XmlElement(name = "DlvrrsCtdnDtls")
	protected PartyIdentificationAndAccount5 deliverersCustodianDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5
	 * PartyIdentificationAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsCtdnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliverersCustodianDetails
	 * DeliveringPartiesAndAccount13.mmDeliverersCustodianDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#mmDeliverersCustodianDetails
	 * DeliveringPartiesAndAccount8.mmDeliverersCustodianDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliverersCustodianDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetails";
			definition = "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent.";
			nextVersions_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount13.mmDeliverersCustodianDetails);
			previousVersion_lazy = () -> DeliveringPartiesAndAccount8.mmDeliverersCustodianDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount5.mmObject();
		}
	};
	@XmlElement(name = "DlvrrsIntrmyDtls")
	protected PartyIdentificationAndAccount5 deliverersIntermediaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount5
	 * PartyIdentificationAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsIntrmyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliverersIntermediary1Details
	 * DeliveringPartiesAndAccount13.mmDeliverersIntermediary1Details}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#mmDeliverersIntermediaryDetails
	 * DeliveringPartiesAndAccount8.mmDeliverersIntermediaryDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliverersIntermediaryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsIntrmyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediaryDetails";
			definition = "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent.";
			nextVersions_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount13.mmDeliverersIntermediary1Details);
			previousVersion_lazy = () -> DeliveringPartiesAndAccount8.mmDeliverersIntermediaryDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount5.mmObject();
		}
	};
	@XmlElement(name = "DlvrgAgtDtls", required = true)
	protected PartyIdentificationAndAccount4 deliveringAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount4
	 * PartyIdentificationAndAccount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, eg, central securities depository."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmDeliveringAgentDetails
	 * DeliveringPartiesAndAccount13.mmDeliveringAgentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#mmDeliveringAgentDetails
	 * DeliveringPartiesAndAccount8.mmDeliveringAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringAgentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, eg, central securities depository.";
			nextVersions_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount13.mmDeliveringAgentDetails);
			previousVersion_lazy = () -> DeliveringPartiesAndAccount8.mmDeliveringAgentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount4.mmObject();
		}
	};
	@XmlElement(name = "SctiesSttlmSys")
	protected Max35Text securitiesSettlementSystem;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the securities settlement system to be used."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmSecuritiesSettlementSystem
	 * DeliveringPartiesAndAccount13.mmSecuritiesSettlementSystem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#mmSecuritiesSettlementSystem
	 * DeliveringPartiesAndAccount8.mmSecuritiesSettlementSystem}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesSettlementSystem = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementSystem.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Identifies the securities settlement system to be used.";
			nextVersions_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount13.mmSecuritiesSettlementSystem);
			previousVersion_lazy = () -> DeliveringPartiesAndAccount8.mmSecuritiesSettlementSystem;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfSttlmDtls")
	protected PartyIdentification21 placeOfSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification21
	 * PartyIdentification21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9
	 * DeliveringPartiesAndAccount9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where settlement of the securities takes place."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmPlaceOfSettlementDetails
	 * DeliveringPartiesAndAccount13.mmPlaceOfSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#mmPlaceOfSettlementDetails
	 * DeliveringPartiesAndAccount8.mmPlaceOfSettlementDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlaceOfSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmObject();
			isDerived = false;
			xmlTag = "PlcOfSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSettlementDetails";
			definition = "Place where settlement of the securities takes place.";
			nextVersions_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount13.mmPlaceOfSettlementDetails);
			previousVersion_lazy = () -> DeliveringPartiesAndAccount8.mmPlaceOfSettlementDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification21.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmDelivererDetails, com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmDeliverersCustodianDetails,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmDeliverersIntermediaryDetails, com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmDeliveringAgentDetails,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmSecuritiesSettlementSystem, com.tools20022.repository.msg.DeliveringPartiesAndAccount9.mmPlaceOfSettlementDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount9);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveringPartiesAndAccount9";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
				nextVersions_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount13.mmObject());
				previousVersion_lazy = () -> DeliveringPartiesAndAccount8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvestmentAccount41> getDelivererDetails() {
		return delivererDetails == null ? Optional.empty() : Optional.of(delivererDetails);
	}

	public DeliveringPartiesAndAccount9 setDelivererDetails(com.tools20022.repository.msg.InvestmentAccount41 delivererDetails) {
		this.delivererDetails = delivererDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount5> getDeliverersCustodianDetails() {
		return deliverersCustodianDetails == null ? Optional.empty() : Optional.of(deliverersCustodianDetails);
	}

	public DeliveringPartiesAndAccount9 setDeliverersCustodianDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount5 deliverersCustodianDetails) {
		this.deliverersCustodianDetails = deliverersCustodianDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount5> getDeliverersIntermediaryDetails() {
		return deliverersIntermediaryDetails == null ? Optional.empty() : Optional.of(deliverersIntermediaryDetails);
	}

	public DeliveringPartiesAndAccount9 setDeliverersIntermediaryDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount5 deliverersIntermediaryDetails) {
		this.deliverersIntermediaryDetails = deliverersIntermediaryDetails;
		return this;
	}

	public PartyIdentificationAndAccount4 getDeliveringAgentDetails() {
		return deliveringAgentDetails;
	}

	public DeliveringPartiesAndAccount9 setDeliveringAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount4 deliveringAgentDetails) {
		this.deliveringAgentDetails = Objects.requireNonNull(deliveringAgentDetails);
		return this;
	}

	public Optional<Max35Text> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem == null ? Optional.empty() : Optional.of(securitiesSettlementSystem);
	}

	public DeliveringPartiesAndAccount9 setSecuritiesSettlementSystem(Max35Text securitiesSettlementSystem) {
		this.securitiesSettlementSystem = securitiesSettlementSystem;
		return this;
	}

	public Optional<PartyIdentification21> getPlaceOfSettlementDetails() {
		return placeOfSettlementDetails == null ? Optional.empty() : Optional.of(placeOfSettlementDetails);
	}

	public DeliveringPartiesAndAccount9 setPlaceOfSettlementDetails(com.tools20022.repository.msg.PartyIdentification21 placeOfSettlementDetails) {
		this.placeOfSettlementDetails = placeOfSettlementDetails;
		return this;
	}
}