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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AlternateIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for the identification of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmISIN
 * SecurityIdentification22Choice.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmAlternateIdentification
 * SecurityIdentification22Choice.mmAlternateIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmRIC
 * SecurityIdentification22Choice.mmRIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmTickerSymbol
 * SecurityIdentification22Choice.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmBloomberg
 * SecurityIdentification22Choice.mmBloomberg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmCTA
 * SecurityIdentification22Choice.mmCTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice#mmCommon
 * SecurityIdentification22Choice.mmCommon}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityIdentification22Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between formats for the identification of a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice
 * SecurityIdentification1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityIdentification22Choice", propOrder = {"iSIN", "alternateIdentification", "rIC", "tickerSymbol", "bloomberg", "cTA", "common"})
public class SecurityIdentification22Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN", required = true)
	protected ISINOct2015Identifier iSIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
	 * SecurityIdentification22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN).  A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmISIN
	 * SecurityIdentification1Choice.mmISIN}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISIN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification22Choice.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN).  A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
			previousVersion_lazy = () -> SecurityIdentification1Choice.mmISIN;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	@XmlElement(name = "AltrnId", required = true)
	protected AlternateIdentification1 alternateIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AlternateIdentification1
	 * AlternateIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
	 * SecurityIdentification22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AltrnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AlternateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of a security assigned by an institution or organisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmAlternateIdentification
	 * SecurityIdentification1Choice.mmAlternateIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAlternateIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification22Choice.mmObject();
			isDerived = false;
			xmlTag = "AltrnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AlternateIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			previousVersion_lazy = () -> SecurityIdentification1Choice.mmAlternateIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AlternateIdentification1.mmObject();
		}
	};
	@XmlElement(name = "RIC", required = true)
	protected RICIdentifier rIC;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RICIdentifier
	 * RICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmRIC
	 * SecuritiesIdentification.mmRIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
	 * SecurityIdentification22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmRIC
	 * SecurityIdentification1Choice.mmRIC}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRIC = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmRIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification22Choice.mmObject();
			isDerived = false;
			xmlTag = "RIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RIC";
			definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.";
			previousVersion_lazy = () -> SecurityIdentification1Choice.mmRIC;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RICIdentifier.mmObject();
		}
	};
	@XmlElement(name = "TckrSymb", required = true)
	protected TickerIdentifier tickerSymbol;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TickerIdentifier
	 * TickerIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmTickerSymbol
	 * SecuritiesIdentification.mmTickerSymbol}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
	 * SecurityIdentification22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TckrSymb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TickerSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmTickerSymbol
	 * SecurityIdentification1Choice.mmTickerSymbol}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTickerSymbol = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmTickerSymbol;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification22Choice.mmObject();
			isDerived = false;
			xmlTag = "TckrSymb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TickerSymbol";
			definition = "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London.";
			previousVersion_lazy = () -> SecurityIdentification1Choice.mmTickerSymbol;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TickerIdentifier.mmObject();
		}
	};
	@XmlElement(name = "Blmbrg", required = true)
	protected BloombergIdentifier bloomberg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BloombergIdentifier
	 * BloombergIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBloomberg
	 * SecuritiesIdentification.mmBloomberg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
	 * SecurityIdentification22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Blmbrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bloomberg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Bloomberg organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmBloomberg
	 * SecurityIdentification1Choice.mmBloomberg}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBloomberg = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmBloomberg;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification22Choice.mmObject();
			isDerived = false;
			xmlTag = "Blmbrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bloomberg";
			definition = "Identifier of a security assigned by the Bloomberg organisation.";
			previousVersion_lazy = () -> SecurityIdentification1Choice.mmBloomberg;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BloombergIdentifier.mmObject();
		}
	};
	@XmlElement(name = "CTA", required = true)
	protected ConsolidatedTapeAssociationIdentifier cTA;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ConsolidatedTapeAssociationIdentifier
	 * ConsolidatedTapeAssociationIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCTA
	 * SecuritiesIdentification.mmCTA}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
	 * SecurityIdentification22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Consolidated Tape Association."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmCTA
	 * SecurityIdentification1Choice.mmCTA}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCTA = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmCTA;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification22Choice.mmObject();
			isDerived = false;
			xmlTag = "CTA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CTA";
			definition = "Identifier of a security assigned by the Consolidated Tape Association.";
			previousVersion_lazy = () -> SecurityIdentification1Choice.mmCTA;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsolidatedTapeAssociationIdentifier.mmObject();
		}
	};
	@XmlElement(name = "Cmon", required = true)
	protected EuroclearClearstreamIdentifier common;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroclearClearstreamIdentifier
	 * EuroclearClearstreamIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCommon
	 * SecuritiesIdentification.mmCommon}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification22Choice
	 * SecurityIdentification22Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Common"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification1Choice#mmCommon
	 * SecurityIdentification1Choice.mmCommon}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommon = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmCommon;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification22Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmon";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Common";
			definition = "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
			previousVersion_lazy = () -> SecurityIdentification1Choice.mmCommon;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroclearClearstreamIdentifier.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification22Choice.mmISIN, com.tools20022.repository.choice.SecurityIdentification22Choice.mmAlternateIdentification,
						com.tools20022.repository.choice.SecurityIdentification22Choice.mmRIC, com.tools20022.repository.choice.SecurityIdentification22Choice.mmTickerSymbol,
						com.tools20022.repository.choice.SecurityIdentification22Choice.mmBloomberg, com.tools20022.repository.choice.SecurityIdentification22Choice.mmCTA,
						com.tools20022.repository.choice.SecurityIdentification22Choice.mmCommon);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityIdentification22Choice";
				definition = "Choice between formats for the identification of a financial instrument.";
				previousVersion_lazy = () -> SecurityIdentification1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISINOct2015Identifier getISIN() {
		return iSIN;
	}

	public SecurityIdentification22Choice setISIN(ISINOct2015Identifier iSIN) {
		this.iSIN = Objects.requireNonNull(iSIN);
		return this;
	}

	public AlternateIdentification1 getAlternateIdentification() {
		return alternateIdentification;
	}

	public SecurityIdentification22Choice setAlternateIdentification(AlternateIdentification1 alternateIdentification) {
		this.alternateIdentification = Objects.requireNonNull(alternateIdentification);
		return this;
	}

	public RICIdentifier getRIC() {
		return rIC;
	}

	public SecurityIdentification22Choice setRIC(RICIdentifier rIC) {
		this.rIC = Objects.requireNonNull(rIC);
		return this;
	}

	public TickerIdentifier getTickerSymbol() {
		return tickerSymbol;
	}

	public SecurityIdentification22Choice setTickerSymbol(TickerIdentifier tickerSymbol) {
		this.tickerSymbol = Objects.requireNonNull(tickerSymbol);
		return this;
	}

	public BloombergIdentifier getBloomberg() {
		return bloomberg;
	}

	public SecurityIdentification22Choice setBloomberg(BloombergIdentifier bloomberg) {
		this.bloomberg = Objects.requireNonNull(bloomberg);
		return this;
	}

	public ConsolidatedTapeAssociationIdentifier getCTA() {
		return cTA;
	}

	public SecurityIdentification22Choice setCTA(ConsolidatedTapeAssociationIdentifier cTA) {
		this.cTA = Objects.requireNonNull(cTA);
		return this;
	}

	public EuroclearClearstreamIdentifier getCommon() {
		return common;
	}

	public SecurityIdentification22Choice setCommon(EuroclearClearstreamIdentifier common) {
		this.common = Objects.requireNonNull(common);
		return this;
	}
}