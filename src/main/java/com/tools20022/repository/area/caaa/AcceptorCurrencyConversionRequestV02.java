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

package com.tools20022.repository.area.caaa;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion;
import com.tools20022.repository.msg.AcceptorCurrencyConversionRequest2;
import com.tools20022.repository.msg.ContentInformationType11;
import com.tools20022.repository.msg.Header10;
import com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20142015;
import com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorCurrencyConversionRequest message is sent by the card acceptor to
 * the currency conversion service provider to request if the cardholder is able
 * to pay in the currency of its card.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV02#mmHeader
 * AcceptorCurrencyConversionRequestV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV02#mmCurrencyConversionRequest
 * AcceptorCurrencyConversionRequestV02.mmCurrencyConversionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV02#mmSecurityTrailer
 * AcceptorCurrencyConversionRequestV02.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion
 * CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20142015
 * CAPEAcceptortoAcquirerMaintenance20142015}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCcyConvsReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion
 * AcceptortoAcquirerCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.016.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCurrencyConversionRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorCurrencyConversionRequest message is sent by the card acceptor to the currency conversion service provider to request if the cardholder is able to pay in the currency of its card.\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV03
 * AcceptorCurrencyConversionRequestV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV01
 * AcceptorCurrencyConversionRequestV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCurrencyConversionRequestV02", propOrder = {"header", "currencyConversionRequest", "securityTrailer"})
public class AcceptorCurrencyConversionRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header10 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header10
	 * Header10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency Conversion request message management information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV03#mmHeader
	 * AcceptorCurrencyConversionRequestV03.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV01#mmHeader
	 * AcceptorCurrencyConversionRequestV01.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Currency Conversion request message management information.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionRequestV03.mmHeader);
			previousVersion_lazy = () -> AcceptorCurrencyConversionRequestV01.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorCurrencyConversionRequestV02.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CcyConvsReq", required = true)
	protected AcceptorCurrencyConversionRequest2 currencyConversionRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionRequest2
	 * AcceptorCurrencyConversionRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvsReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the currency conversion request."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV03#mmCurrencyConversionRequest
	 * AcceptorCurrencyConversionRequestV03.mmCurrencyConversionRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV01#mmCurrencyConversionRequest
	 * AcceptorCurrencyConversionRequestV01.mmCurrencyConversionRequest}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCurrencyConversionRequest = new MMMessageBuildingBlock() {
		{
			xmlTag = "CcyConvsReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionRequest";
			definition = "Information related to the currency conversion request.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionRequestV03.mmCurrencyConversionRequest);
			previousVersion_lazy = () -> AcceptorCurrencyConversionRequestV01.mmCurrencyConversionRequest;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorCurrencyConversionRequest2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorCurrencyConversionRequestV02.class.getMethod("getCurrencyConversionRequest", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SctyTrlr", required = true)
	protected ContentInformationType11 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType11
	 * ContentInformationType11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV03#mmSecurityTrailer
	 * AcceptorCurrencyConversionRequestV03.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV01#mmSecurityTrailer
	 * AcceptorCurrencyConversionRequestV01.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionRequestV03.mmSecurityTrailer);
			previousVersion_lazy = () -> AcceptorCurrencyConversionRequestV01.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorCurrencyConversionRequestV02.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCurrencyConversionRequestV02";
				definition = "The AcceptorCurrencyConversionRequest message is sent by the card acceptor to the currency conversion service provider to request if the cardholder is able to pay in the currency of its card.\r\n";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionRequestV03.mmObject());
				previousVersion_lazy = () -> AcceptorCurrencyConversionRequestV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(CardPaymentsExchangesAcceptortoAcquirerISOPreviousversion.mmObject(), CAPEAcceptortoAcquirerMaintenance20142015.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCcyConvsReq";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV02.mmHeader,
						com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV02.mmCurrencyConversionRequest, com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV02.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "016";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorCurrencyConversionRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header10 getHeader() {
		return header;
	}

	public AcceptorCurrencyConversionRequestV02 setHeader(Header10 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorCurrencyConversionRequest2 getCurrencyConversionRequest() {
		return currencyConversionRequest;
	}

	public AcceptorCurrencyConversionRequestV02 setCurrencyConversionRequest(AcceptorCurrencyConversionRequest2 currencyConversionRequest) {
		this.currencyConversionRequest = Objects.requireNonNull(currencyConversionRequest);
		return this;
	}

	public ContentInformationType11 getSecurityTrailer() {
		return securityTrailer;
	}

	public AcceptorCurrencyConversionRequestV02 setSecurityTrailer(ContentInformationType11 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.016.001.02")
	static public class Document {
		@XmlElement(name = "AccptrCcyConvsReq", required = true)
		public AcceptorCurrencyConversionRequestV02 messageBody;
	}
}