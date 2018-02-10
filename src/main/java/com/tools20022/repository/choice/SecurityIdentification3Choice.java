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
import com.tools20022.repository.msg.AlternateSecurityIdentification1;
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
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmISIN
 * SecurityIdentification3Choice.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmSEDOL
 * SecurityIdentification3Choice.mmSEDOL}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCUSIP
 * SecurityIdentification3Choice.mmCUSIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmRIC
 * SecurityIdentification3Choice.mmRIC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmTickerSymbol
 * SecurityIdentification3Choice.mmTickerSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmBloomberg
 * SecurityIdentification3Choice.mmBloomberg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCTA
 * SecurityIdentification3Choice.mmCTA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmQUICK
 * SecurityIdentification3Choice.mmQUICK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmWertpapier
 * SecurityIdentification3Choice.mmWertpapier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmDutch
 * SecurityIdentification3Choice.mmDutch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmValoren
 * SecurityIdentification3Choice.mmValoren}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmSicovam
 * SecurityIdentification3Choice.mmSicovam}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmBelgian
 * SecurityIdentification3Choice.mmBelgian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmCommon
 * SecurityIdentification3Choice.mmCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice#mmOtherProprietaryIdentification
 * SecurityIdentification3Choice.mmOtherProprietaryIdentification}</li>
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
 * "SecurityIdentification3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between formats for the identification of a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice
 * SecurityIdentification23Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityIdentification3Choice", propOrder = {"iSIN", "sEDOL", "cUSIP", "rIC", "tickerSymbol", "bloomberg", "cTA", "qUICK", "wertpapier", "dutch", "valoren", "sicovam", "belgian", "common", "otherProprietaryIdentification"})
public class SecurityIdentification3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN", required = true)
	protected ISINIdentifier iSIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINIdentifier
	 * ISINIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmISIN
	 * SecurityIdentification23Choice.mmISIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISIN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN).  A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmISIN);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINIdentifier.mmObject();
		}
	};
	@XmlElement(name = "SEDOL", required = true)
	protected SEDOLIdentifier sEDOL;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SEDOLIdentifier
	 * SEDOLIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSEDOL
	 * SecuritiesIdentification.mmSEDOL}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SEDOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SEDOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmSEDOL
	 * SecurityIdentification23Choice.mmSEDOL}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSEDOL = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSEDOL;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "SEDOL";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SEDOL";
			definition = "Stock Exchange Daily Official List (SEDOL) number.  A code used by the London Stock Exchange to identify foreign stocks, especially those that aren't actively traded in the US and don't have a CUSIP number.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmSEDOL);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SEDOLIdentifier.mmObject();
		}
	};
	@XmlElement(name = "CUSIP", required = true)
	protected CUSIPIdentifier cUSIP;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CUSIPIdentifier
	 * CUSIPIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmCUSIP
	 * SecuritiesIdentification.mmCUSIP}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCUSIP
	 * SecurityIdentification23Choice.mmCUSIP}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCUSIP = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmCUSIP;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "CUSIP";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIP";
			definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. The CUSIP is composed of a 9-character number that uniquely identifies a particular security.  Non-US securities have a similar number called the CINS number.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmCUSIP);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CUSIPIdentifier.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmRIC
	 * SecurityIdentification23Choice.mmRIC}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRIC = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmRIC;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "RIC";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RIC";
			definition = "Reuters Identification Code (RIC). A numbering system used within the Reuters system to identify instruments worldwide. The RIC contains an X-character market specific code (can be the CUSIP or EPIC codes) followed by a full stop, then the two-digit ISO country code, eg, IBM in UK is IBM.UK.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmRIC);
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
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmTickerSymbol
	 * SecurityIdentification23Choice.mmTickerSymbol}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTickerSymbol = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmTickerSymbol;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "TckrSymb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TickerSymbol";
			definition = "Letters that identify a stock traded on a stock exchange. The Ticker Symbol is a short and convenient way of identifying a stock, eg, RTR.L for Reuters quoted in London.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmTickerSymbol);
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
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmBloomberg
	 * SecurityIdentification23Choice.mmBloomberg}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBloomberg = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmBloomberg;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "Blmbrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bloomberg";
			definition = "Identifier of a security assigned by the Bloomberg organisation.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmBloomberg);
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
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCTA
	 * SecurityIdentification23Choice.mmCTA}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCTA = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmCTA;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "CTA";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CTA";
			definition = "Identifier of a security assigned by the Consolidated Tape Association.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmCTA);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConsolidatedTapeAssociationIdentifier.mmObject();
		}
	};
	@XmlElement(name = "QUICK", required = true)
	protected QUICKIdentifier qUICK;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.QUICKIdentifier
	 * QUICKIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmQUICK
	 * SecuritiesIdentification.mmQUICK}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QUICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QUICK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmQUICK
	 * SecurityIdentification23Choice.mmQUICK}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQUICK = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmQUICK;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "QUICK";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QUICK";
			definition = "Identifier of a security assigned by the Japanese QUICK identification scheme for financial instruments.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmQUICK);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QUICKIdentifier.mmObject();
		}
	};
	@XmlElement(name = "Wrtppr", required = true)
	protected WertpapierIdentifier wertpapier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.WertpapierIdentifier
	 * WertpapierIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmWertpapier
	 * SecuritiesIdentification.mmWertpapier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wrtppr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wertpapier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmWertpapier
	 * SecurityIdentification23Choice.mmWertpapier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWertpapier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmWertpapier;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "Wrtppr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wertpapier";
			definition = "Wertpapier Kenn-nummer.  A number issued in Germany by the Wertpapier Mitteilungen. The Wertpapier Kenn-nummer, sometimes called WPK, contains 6-digits, but no check digit. There are different ranges of numbers representing different classes of securities.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmWertpapier);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WertpapierIdentifier.mmObject();
		}
	};
	@XmlElement(name = "Dtch", required = true)
	protected DutchIdentifier dutch;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DutchIdentifier
	 * DutchIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmDutch
	 * SecuritiesIdentification.mmDutch}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dtch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dutch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Dutch securities."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmDutch
	 * SecurityIdentification23Choice.mmDutch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDutch = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmDutch;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "Dtch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dutch";
			definition = "Identifier for Dutch securities.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmDutch);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DutchIdentifier.mmObject();
		}
	};
	@XmlElement(name = "Vlrn", required = true)
	protected ValorenIdentifier valoren;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ValorenIdentifier
	 * ValorenIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmValoren
	 * SecuritiesIdentification.mmValoren}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vlrn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valoren"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmValoren
	 * SecurityIdentification23Choice.mmValoren}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValoren = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmValoren;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "Vlrn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Valoren";
			definition = "Identifier for Swiss securities assigned by Telekurs Financial, the Swiss numbering agency.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmValoren);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValorenIdentifier.mmObject();
		}
	};
	@XmlElement(name = "SCVM", required = true)
	protected SicovamIdentifier sicovam;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SicovamIdentifier
	 * SicovamIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSicovam
	 * SecuritiesIdentification.mmSicovam}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SCVM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sicovam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmSicovam
	 * SecurityIdentification23Choice.mmSicovam}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSicovam = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSicovam;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "SCVM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sicovam";
			definition = "Identifier for French securities assigned by the Societe Interprofessionnelle Pour La Compensation des Valeurs Mobilieres in France.  The Sicovam is composed of 5-digits.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmSicovam);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SicovamIdentifier.mmObject();
		}
	};
	@XmlElement(name = "Belgn", required = true)
	protected BelgianIdentifier belgian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BelgianIdentifier
	 * BelgianIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmBelgian
	 * SecuritiesIdentification.mmBelgian}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Belgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Belgian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for Belgian securities."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmBelgian
	 * SecurityIdentification23Choice.mmBelgian}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBelgian = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmBelgian;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "Belgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Belgian";
			definition = "Identifier for Belgian securities.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmBelgian);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BelgianIdentifier.mmObject();
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
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmCommon
	 * SecurityIdentification23Choice.mmCommon}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommon = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmCommon;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmon";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Common";
			definition = "Identifier of securities issued in Luxembourg.  The common code is a 9-digit code that replaces the CEDEL (Clearstream) and Euroclear codes.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmCommon);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroclearClearstreamIdentifier.mmObject();
		}
	};
	@XmlElement(name = "OthrPrtryId", required = true)
	protected AlternateSecurityIdentification1 otherProprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AlternateSecurityIdentification1
	 * AlternateSecurityIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification of a security assigned by an institution or organisation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice#mmOtherProprietaryIdentification
	 * SecurityIdentification23Choice.mmOtherProprietaryIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherProprietaryIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityIdentification3Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrPrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProprietaryIdentification";
			definition = "Proprietary identification of a security assigned by an institution or organisation.";
			nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmOtherProprietaryIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AlternateSecurityIdentification1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityIdentification3Choice.mmISIN, com.tools20022.repository.choice.SecurityIdentification3Choice.mmSEDOL,
						com.tools20022.repository.choice.SecurityIdentification3Choice.mmCUSIP, com.tools20022.repository.choice.SecurityIdentification3Choice.mmRIC,
						com.tools20022.repository.choice.SecurityIdentification3Choice.mmTickerSymbol, com.tools20022.repository.choice.SecurityIdentification3Choice.mmBloomberg,
						com.tools20022.repository.choice.SecurityIdentification3Choice.mmCTA, com.tools20022.repository.choice.SecurityIdentification3Choice.mmQUICK,
						com.tools20022.repository.choice.SecurityIdentification3Choice.mmWertpapier, com.tools20022.repository.choice.SecurityIdentification3Choice.mmDutch,
						com.tools20022.repository.choice.SecurityIdentification3Choice.mmValoren, com.tools20022.repository.choice.SecurityIdentification3Choice.mmSicovam,
						com.tools20022.repository.choice.SecurityIdentification3Choice.mmBelgian, com.tools20022.repository.choice.SecurityIdentification3Choice.mmCommon,
						com.tools20022.repository.choice.SecurityIdentification3Choice.mmOtherProprietaryIdentification);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityIdentification3Choice";
				definition = "Choice between formats for the identification of a financial instrument.";
				nextVersions_lazy = () -> Arrays.asList(SecurityIdentification23Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ISINIdentifier getISIN() {
		return iSIN;
	}

	public SecurityIdentification3Choice setISIN(ISINIdentifier iSIN) {
		this.iSIN = Objects.requireNonNull(iSIN);
		return this;
	}

	public SEDOLIdentifier getSEDOL() {
		return sEDOL;
	}

	public SecurityIdentification3Choice setSEDOL(SEDOLIdentifier sEDOL) {
		this.sEDOL = Objects.requireNonNull(sEDOL);
		return this;
	}

	public CUSIPIdentifier getCUSIP() {
		return cUSIP;
	}

	public SecurityIdentification3Choice setCUSIP(CUSIPIdentifier cUSIP) {
		this.cUSIP = Objects.requireNonNull(cUSIP);
		return this;
	}

	public RICIdentifier getRIC() {
		return rIC;
	}

	public SecurityIdentification3Choice setRIC(RICIdentifier rIC) {
		this.rIC = Objects.requireNonNull(rIC);
		return this;
	}

	public TickerIdentifier getTickerSymbol() {
		return tickerSymbol;
	}

	public SecurityIdentification3Choice setTickerSymbol(TickerIdentifier tickerSymbol) {
		this.tickerSymbol = Objects.requireNonNull(tickerSymbol);
		return this;
	}

	public BloombergIdentifier getBloomberg() {
		return bloomberg;
	}

	public SecurityIdentification3Choice setBloomberg(BloombergIdentifier bloomberg) {
		this.bloomberg = Objects.requireNonNull(bloomberg);
		return this;
	}

	public ConsolidatedTapeAssociationIdentifier getCTA() {
		return cTA;
	}

	public SecurityIdentification3Choice setCTA(ConsolidatedTapeAssociationIdentifier cTA) {
		this.cTA = Objects.requireNonNull(cTA);
		return this;
	}

	public QUICKIdentifier getQUICK() {
		return qUICK;
	}

	public SecurityIdentification3Choice setQUICK(QUICKIdentifier qUICK) {
		this.qUICK = Objects.requireNonNull(qUICK);
		return this;
	}

	public WertpapierIdentifier getWertpapier() {
		return wertpapier;
	}

	public SecurityIdentification3Choice setWertpapier(WertpapierIdentifier wertpapier) {
		this.wertpapier = Objects.requireNonNull(wertpapier);
		return this;
	}

	public DutchIdentifier getDutch() {
		return dutch;
	}

	public SecurityIdentification3Choice setDutch(DutchIdentifier dutch) {
		this.dutch = Objects.requireNonNull(dutch);
		return this;
	}

	public ValorenIdentifier getValoren() {
		return valoren;
	}

	public SecurityIdentification3Choice setValoren(ValorenIdentifier valoren) {
		this.valoren = Objects.requireNonNull(valoren);
		return this;
	}

	public SicovamIdentifier getSicovam() {
		return sicovam;
	}

	public SecurityIdentification3Choice setSicovam(SicovamIdentifier sicovam) {
		this.sicovam = Objects.requireNonNull(sicovam);
		return this;
	}

	public BelgianIdentifier getBelgian() {
		return belgian;
	}

	public SecurityIdentification3Choice setBelgian(BelgianIdentifier belgian) {
		this.belgian = Objects.requireNonNull(belgian);
		return this;
	}

	public EuroclearClearstreamIdentifier getCommon() {
		return common;
	}

	public SecurityIdentification3Choice setCommon(EuroclearClearstreamIdentifier common) {
		this.common = Objects.requireNonNull(common);
		return this;
	}

	public AlternateSecurityIdentification1 getOtherProprietaryIdentification() {
		return otherProprietaryIdentification;
	}

	public SecurityIdentification3Choice setOtherProprietaryIdentification(AlternateSecurityIdentification1 otherProprietaryIdentification) {
		this.otherProprietaryIdentification = Objects.requireNonNull(otherProprietaryIdentification);
		return this;
	}
}