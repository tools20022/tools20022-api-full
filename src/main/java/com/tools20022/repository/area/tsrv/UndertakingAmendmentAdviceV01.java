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

package com.tools20022.repository.area.tsrv;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesLatestVersion;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.msg.Amendment2;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.PartyIdentification43;
import com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * The UndertakingAmendmentAdvice message is sent by an advising party to the
 * beneficiary, either directly or via one or more other advising parties in the
 * transaction chain, to advise the content of a proposed amendment to an
 * undertaking. Information about the message may also be sent to other
 * interested parties. The proposed undertaking amendment could be to a demand
 * guarantee, standby letter of credit, or counter-undertaking
 * (counter-guarantee or counter-standby). In addition to providing the terms of
 * the proposed amendment and relevant details on proposed changes to the
 * undertaking, the message may provide information from the sender such as
 * confirmation details. It may also be used to advise the proposed termination
 * or cancellation of the undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.006.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion
 * DemandGuaranteesandStandbyLettersofCreditISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "UdrtkgAmdmntAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01#mmAdvisingParty
 * UndertakingAmendmentAdviceV01.mmAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01#mmSecondAdvisingParty
 * UndertakingAmendmentAdviceV01.mmSecondAdvisingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01#mmDateOfAdvice
 * UndertakingAmendmentAdviceV01.mmDateOfAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01#mmUndertakingAmendmentAdviceDetails
 * UndertakingAmendmentAdviceV01.mmUndertakingAmendmentAdviceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01#mmBankToBankInformation
 * UndertakingAmendmentAdviceV01.mmBankToBankInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01#mmDigitalSignature
 * UndertakingAmendmentAdviceV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingAmendmentAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The UndertakingAmendmentAdvice message is sent by an advising party to the beneficiary, either directly or via one or more other advising parties in the transaction chain, to advise the content of a proposed amendment to an undertaking. Information about the message may also be sent to other interested parties. The proposed undertaking amendment could be to a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). In addition to providing the terms of the proposed amendment and relevant details on proposed changes to the undertaking, the message may provide information from the sender such as confirmation details. It may also be used to advise the proposed termination or cancellation of the undertaking."
 * </li>
 * </ul>
 */
public class UndertakingAmendmentAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification43 advisingParty;
	/**
	 * Party advising the undertaking to the beneficiary or to another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdvsgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party advising the undertaking to the beneficiary or to another party."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdvisingParty = new MMMessageBuildingBlock() {
		{
			xmlTag = "AdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdvisingParty";
			definition = "Party advising the undertaking to the beneficiary or to another party.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	protected PartyIdentification43 secondAdvisingParty;
	/**
	 * Additional party that advises the undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndAdvsgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondAdvisingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional party that advises the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecondAdvisingParty = new MMMessageBuildingBlock() {
		{
			xmlTag = "ScndAdvsgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingParty";
			definition = "Additional party that advises the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification43.mmObject();
		}
	};
	protected ISODate dateOfAdvice;
	/**
	 * Date on which the undertaking is advised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtOfAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the undertaking is advised."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDateOfAdvice = new MMMessageBuildingBlock() {
		{
			xmlTag = "DtOfAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfAdvice";
			definition = "Date on which the undertaking is advised.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Amendment2 undertakingAmendmentAdviceDetails;
	/**
	 * Details related to the advice of the proposed amended undertaking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgAmdmntAdvcDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendmentAdviceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the advice of the proposed amended undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUndertakingAmendmentAdviceDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UdrtkgAmdmntAdvcDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendmentAdviceDetails";
			definition = "Details related to the advice of the proposed amended undertaking.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Amendment2.mmObject();
		}
	};
	protected List<Max2000Text> bankToBankInformation;
	/**
	 * Additional information specific to the bank-to-bank communication.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkToBkInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankToBankInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information specific to the bank-to-bank communication."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBankToBankInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "BkToBkInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankToBankInformation";
			definition = "Additional information specific to the bank-to-bank communication.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	protected PartyAndSignature2 digitalSignature;
	/**
	 * Digital signature of the proposed amendment advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature of the proposed amendment advice."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the proposed amendment advice.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingAmendmentAdviceV01";
				definition = "The UndertakingAmendmentAdvice message is sent by an advising party to the beneficiary, either directly or via one or more other advising parties in the transaction chain, to advise the content of a proposed amendment to an undertaking. Information about the message may also be sent to other interested parties. The proposed undertaking amendment could be to a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). In addition to providing the terms of the proposed amendment and relevant details on proposed changes to the undertaking, the message may provide information from the sender such as confirmation details. It may also be used to advise the proposed termination or cancellation of the undertaking.";
				messageSet_lazy = () -> Arrays.asList(DemandGuaranteesandStandbyLettersofCreditISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "UdrtkgAmdmntAdvc";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingAmendmentAdviceV01.mmAdvisingParty, UndertakingAmendmentAdviceV01.mmSecondAdvisingParty, UndertakingAmendmentAdviceV01.mmDateOfAdvice,
						UndertakingAmendmentAdviceV01.mmUndertakingAmendmentAdviceDetails, UndertakingAmendmentAdviceV01.mmBankToBankInformation, UndertakingAmendmentAdviceV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "006";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification43 getAdvisingParty() {
		return advisingParty;
	}

	public void setAdvisingParty(PartyIdentification43 advisingParty) {
		this.advisingParty = advisingParty;
	}

	public PartyIdentification43 getSecondAdvisingParty() {
		return secondAdvisingParty;
	}

	public void setSecondAdvisingParty(PartyIdentification43 secondAdvisingParty) {
		this.secondAdvisingParty = secondAdvisingParty;
	}

	public ISODate getDateOfAdvice() {
		return dateOfAdvice;
	}

	public void setDateOfAdvice(ISODate dateOfAdvice) {
		this.dateOfAdvice = dateOfAdvice;
	}

	public Amendment2 getUndertakingAmendmentAdviceDetails() {
		return undertakingAmendmentAdviceDetails;
	}

	public void setUndertakingAmendmentAdviceDetails(Amendment2 undertakingAmendmentAdviceDetails) {
		this.undertakingAmendmentAdviceDetails = undertakingAmendmentAdviceDetails;
	}

	public List<Max2000Text> getBankToBankInformation() {
		return bankToBankInformation;
	}

	public void setBankToBankInformation(List<Max2000Text> bankToBankInformation) {
		this.bankToBankInformation = bankToBankInformation;
	}

	public PartyAndSignature2 getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
	}
}