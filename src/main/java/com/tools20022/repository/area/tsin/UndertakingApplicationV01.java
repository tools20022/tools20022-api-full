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

package com.tools20022.repository.area.tsin;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.Undertaking1;
import com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The UndertakingApplication message is sent by the party requesting issuance
 * of the undertaking (applicant or obligor) to the party issuing the
 * undertaking. It is used to request the issuance of an undertaking (demand
 * guarantee or standby letter of credit or suretyship) or counter-undertaking
 * (counter-guarantee or counter-standby or suretyship), and provides details on
 * the applicable rules, terms, conditions and content of the undertaking to be
 * issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.UndertakingApplicationV01#mmUndertakingApplicationDetails
 * UndertakingApplicationV01.mmUndertakingApplicationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.UndertakingApplicationV01#mmInstructionsToBank
 * UndertakingApplicationV01.mmInstructionsToBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.UndertakingApplicationV01#mmDigitalSignature
 * UndertakingApplicationV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion
 * DemandGuaranteesandStandbyLettersofCreditISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "UdrtkgAppl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.005.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingApplicationV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The UndertakingApplication message is sent by the party requesting issuance of the undertaking (applicant or obligor) to the party issuing the undertaking. It is used to request the issuance of an undertaking (demand guarantee or standby letter of credit or suretyship) or counter-undertaking (counter-guarantee or counter-standby or suretyship), and provides details on the applicable rules, terms, conditions and content of the undertaking to be issued."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingApplicationV01", propOrder = {"undertakingApplicationDetails", "instructionsToBank", "digitalSignature"})
public class UndertakingApplicationV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgApplDtls", required = true)
	protected Undertaking1 undertakingApplicationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Undertaking1
	 * Undertaking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgApplDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingApplicationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the application for an independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUndertakingApplicationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UdrtkgApplDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingApplicationDetails";
			definition = "Details of the application for an independent undertaking, such as a demand guarantee or standby letter of credit, that provides financial assurance, to be collected on the presentation of documents that comply with its terms and conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Undertaking1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingApplicationV01.class.getMethod("getUndertakingApplicationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "InstrsToBk")
	protected List<Max2000Text> instructionsToBank;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrsToBk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionsToBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructions specific to the bank receiving the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionsToBank = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrsToBk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionsToBank";
			definition = "Instructions specific to the bank receiving the message.";
			maxOccurs = 5;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingApplicationV01.class.getMethod("getInstructionsToBank", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected PartyAndSignature2 digitalSignature;
	/**
	 * 
	 <p>
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
	 * definition} = "Digital signature of the undertaking application."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the undertaking application.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return UndertakingApplicationV01.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingApplicationV01";
				definition = "The UndertakingApplication message is sent by the party requesting issuance of the undertaking (applicant or obligor) to the party issuing the undertaking. It is used to request the issuance of an undertaking (demand guarantee or standby letter of credit or suretyship) or counter-undertaking (counter-guarantee or counter-standby or suretyship), and provides details on the applicable rules, terms, conditions and content of the undertaking to be issued.";
				messageSet_lazy = () -> Arrays.asList(DemandGuaranteesandStandbyLettersofCreditISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "UdrtkgAppl";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.UndertakingApplicationV01.mmUndertakingApplicationDetails,
						com.tools20022.repository.area.tsin.UndertakingApplicationV01.mmInstructionsToBank, com.tools20022.repository.area.tsin.UndertakingApplicationV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "005";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return UndertakingApplicationV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking1 getUndertakingApplicationDetails() {
		return undertakingApplicationDetails;
	}

	public UndertakingApplicationV01 setUndertakingApplicationDetails(Undertaking1 undertakingApplicationDetails) {
		this.undertakingApplicationDetails = Objects.requireNonNull(undertakingApplicationDetails);
		return this;
	}

	public List<Max2000Text> getInstructionsToBank() {
		return instructionsToBank == null ? instructionsToBank = new ArrayList<>() : instructionsToBank;
	}

	public UndertakingApplicationV01 setInstructionsToBank(List<Max2000Text> instructionsToBank) {
		this.instructionsToBank = Objects.requireNonNull(instructionsToBank);
		return this;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? Optional.empty() : Optional.of(digitalSignature);
	}

	public UndertakingApplicationV01 setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.005.001.01")
	static public class Document {
		@XmlElement(name = "UdrtkgAppl", required = true)
		public UndertakingApplicationV01 messageBody;
	}
}