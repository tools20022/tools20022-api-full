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
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.TradeStatusReport1;
import com.tools20022.repository.msgset.DemandGuaranteesandStandbyLettersofCreditISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The TradeStatusReport message is exchanged between parties involved in the
 * trade finance domain to report the transaction level status of a transaction
 * previously received. It informs the sender about the positive or negative
 * status of the referenced transaction, such as acceptance or rejection
 * resulting from technical validation performed by the parser and/or
 * front-office applications. It can be used, for example, to acknowledge
 * receipt of a transaction, to report a syntactical error, to report an
 * unrecognised digital signature, to indicate that further processing is
 * pending, and to indicate that a transaction has been technically accepted for
 * processing by the back-office application. Multiple TradeStatusReport
 * messages may be progressively sent in response to the incremental processing
 * of a single transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.TradeStatusReportV01#mmTradeStatusAdviceDetails
 * TradeStatusReportV01.mmTradeStatusAdviceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.TradeStatusReportV01#mmDigitalSignature
 * TradeStatusReportV01.mmDigitalSignature}</li>
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
 * xmlTag} = "TradStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesLatestVersion
 * TradeServicesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsrv.018.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeStatusReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The TradeStatusReport message is exchanged between parties involved in the trade finance domain to report the transaction level status of a transaction previously received. It informs the sender about the positive or negative status of the referenced transaction, such as acceptance or rejection resulting from technical validation performed by the parser and/or front-office applications. It can be used, for example, to acknowledge receipt of a transaction, to report a syntactical error, to report an unrecognised digital signature, to indicate that further processing is pending, and to indicate that a transaction has been technically accepted for processing by the back-office application. Multiple TradeStatusReport messages may be progressively sent in response to the incremental processing of a single transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeStatusReportV01", propOrder = {"tradeStatusAdviceDetails", "digitalSignature"})
public class TradeStatusReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradStsAdvcDtls", required = true)
	protected TradeStatusReport1 tradeStatusAdviceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradeStatusReport1
	 * TradeStatusReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradStsAdvcDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeStatusAdviceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the trade status report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeStatusAdviceDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradStsAdvcDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeStatusAdviceDetails";
			definition = "Details of the trade status report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeStatusReport1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeStatusReportV01.class.getMethod("getTradeStatusAdviceDetails", new Class[]{});
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
	 * definition} = "Digital signature of the report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeStatusReportV01.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeStatusReportV01";
				definition = "The TradeStatusReport message is exchanged between parties involved in the trade finance domain to report the transaction level status of a transaction previously received. It informs the sender about the positive or negative status of the referenced transaction, such as acceptance or rejection resulting from technical validation performed by the parser and/or front-office applications. It can be used, for example, to acknowledge receipt of a transaction, to report a syntactical error, to report an unrecognised digital signature, to indicate that further processing is pending, and to indicate that a transaction has been technically accepted for processing by the back-office application. Multiple TradeStatusReport messages may be progressively sent in response to the incremental processing of a single transaction.";
				messageSet_lazy = () -> Arrays.asList(DemandGuaranteesandStandbyLettersofCreditISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "TradStsRpt";
				businessArea_lazy = () -> TradeServicesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.TradeStatusReportV01.mmTradeStatusAdviceDetails, com.tools20022.repository.area.tsrv.TradeStatusReportV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsrv";
						messageFunctionality = "018";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeStatusReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeStatusReport1 getTradeStatusAdviceDetails() {
		return tradeStatusAdviceDetails;
	}

	public TradeStatusReportV01 setTradeStatusAdviceDetails(TradeStatusReport1 tradeStatusAdviceDetails) {
		this.tradeStatusAdviceDetails = Objects.requireNonNull(tradeStatusAdviceDetails);
		return this;
	}

	public Optional<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? Optional.empty() : Optional.of(digitalSignature);
	}

	public TradeStatusReportV01 setDigitalSignature(PartyAndSignature2 digitalSignature) {
		this.digitalSignature = digitalSignature;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsrv.018.001.01")
	static public class Document {
		@XmlElement(name = "TradStsRpt", required = true)
		public TradeStatusReportV01 messageBody;
	}
}