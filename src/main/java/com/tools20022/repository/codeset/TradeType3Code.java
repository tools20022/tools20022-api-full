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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TradeType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of executed order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#Basket
 * TradeType3Code.Basket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#Index
 * TradeType3Code.Index}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#IPO
 * TradeType3Code.IPO}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#List
 * TradeType3Code.List}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#PreAllocation
 * TradeType3Code.PreAllocation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#Program
 * TradeType3Code.Program}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#Trade
 * TradeType3Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#BrokerToBroker
 * TradeType3Code.BrokerToBroker}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#RiskTrade
 * TradeType3Code.RiskTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#VWAPGuarantee
 * TradeType3Code.VWAPGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#Agency
 * TradeType3Code.Agency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#GuaranteedClose
 * TradeType3Code.GuaranteedClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#EmployeeTradeReporting
 * TradeType3Code.EmployeeTradeReporting}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#Issuance
 * TradeType3Code.Issuance}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#BondStart
 * TradeType3Code.BondStart}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#BondEnd
 * TradeType3Code.BondEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#LendingAndBorrowing
 * TradeType3Code.LendingAndBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#BondRepricing
 * TradeType3Code.BondRepricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#OfferingIssuingTrade
 * TradeType3Code.OfferingIssuingTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#BondSubstitution
 * TradeType3Code.BondSubstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#FutureBuyBackTrade
 * TradeType3Code.FutureBuyBackTrade}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#Options
 * TradeType3Code.Options}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType3Code#FuturesOption
 * TradeType3Code.FuturesOption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType3Code#Futures
 * TradeType3Code.Futures}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeTypeCode TradeTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BSKT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of executed order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basket"</li>
	 * </ul>
	 */
	public static final TradeType3Code Basket = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basket";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.Basket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * </ul>
	 */
	public static final TradeType3Code Index = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.Index.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IPO"</li>
	 * </ul>
	 */
	public static final TradeType3Code IPO = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IPO";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.IPO.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "List"</li>
	 * </ul>
	 */
	public static final TradeType3Code List = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "List";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.List.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAllocation"</li>
	 * </ul>
	 */
	public static final TradeType3Code PreAllocation = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.PreAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Program"</li>
	 * </ul>
	 */
	public static final TradeType3Code Program = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Program";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.Program.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * </ul>
	 */
	public static final TradeType3Code Trade = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.Trade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerToBroker"</li>
	 * </ul>
	 */
	public static final TradeType3Code BrokerToBroker = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerToBroker";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.BrokerToBroker.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskTrade"</li>
	 * </ul>
	 */
	public static final TradeType3Code RiskTrade = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.RiskTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPGuarantee"</li>
	 * </ul>
	 */
	public static final TradeType3Code VWAPGuarantee = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VWAPGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.VWAPGuarantee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agency"</li>
	 * </ul>
	 */
	public static final TradeType3Code Agency = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agency";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.Agency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedClose"</li>
	 * </ul>
	 */
	public static final TradeType3Code GuaranteedClose = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedClose";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.GuaranteedClose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeTradeReporting"</li>
	 * </ul>
	 */
	public static final TradeType3Code EmployeeTradeReporting = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeTradeReporting";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.EmployeeTradeReporting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * </ul>
	 */
	public static final TradeType3Code Issuance = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.Issuance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondStart"</li>
	 * </ul>
	 */
	public static final TradeType3Code BondStart = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondStart";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.BondStart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondEnd"</li>
	 * </ul>
	 */
	public static final TradeType3Code BondEnd = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondEnd";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.BondEnd.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingAndBorrowing"</li>
	 * </ul>
	 */
	public static final TradeType3Code LendingAndBorrowing = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingAndBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.LendingAndBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondRepricing"</li>
	 * </ul>
	 */
	public static final TradeType3Code BondRepricing = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondRepricing";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.BondRepricing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferingIssuingTrade"</li>
	 * </ul>
	 */
	public static final TradeType3Code OfferingIssuingTrade = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferingIssuingTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.OfferingIssuingTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondSubstitution"</li>
	 * </ul>
	 */
	public static final TradeType3Code BondSubstitution = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondSubstitution";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.BondSubstitution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureBuyBackTrade"</li>
	 * </ul>
	 */
	public static final TradeType3Code FutureBuyBackTrade = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureBuyBackTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.FutureBuyBackTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Options"</li>
	 * </ul>
	 */
	public static final TradeType3Code Options = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Options";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.Options.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FuturesOption"</li>
	 * </ul>
	 */
	public static final TradeType3Code FuturesOption = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FuturesOption";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.FuturesOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType3Code
	 * TradeType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Futures"</li>
	 * </ul>
	 */
	public static final TradeType3Code Futures = new TradeType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Futures";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType3Code.mmObject();
			codeName = TradeTypeCode.Futures.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeType3Code> codesByName = new LinkedHashMap<>();

	protected TradeType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BSKT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeType3Code";
				definition = "Specifies the type of executed order.";
				trace_lazy = () -> TradeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeType3Code.Basket, com.tools20022.repository.codeset.TradeType3Code.Index, com.tools20022.repository.codeset.TradeType3Code.IPO,
						com.tools20022.repository.codeset.TradeType3Code.List, com.tools20022.repository.codeset.TradeType3Code.PreAllocation, com.tools20022.repository.codeset.TradeType3Code.Program,
						com.tools20022.repository.codeset.TradeType3Code.Trade, com.tools20022.repository.codeset.TradeType3Code.BrokerToBroker, com.tools20022.repository.codeset.TradeType3Code.RiskTrade,
						com.tools20022.repository.codeset.TradeType3Code.VWAPGuarantee, com.tools20022.repository.codeset.TradeType3Code.Agency, com.tools20022.repository.codeset.TradeType3Code.GuaranteedClose,
						com.tools20022.repository.codeset.TradeType3Code.EmployeeTradeReporting, com.tools20022.repository.codeset.TradeType3Code.Issuance, com.tools20022.repository.codeset.TradeType3Code.BondStart,
						com.tools20022.repository.codeset.TradeType3Code.BondEnd, com.tools20022.repository.codeset.TradeType3Code.LendingAndBorrowing, com.tools20022.repository.codeset.TradeType3Code.BondRepricing,
						com.tools20022.repository.codeset.TradeType3Code.OfferingIssuingTrade, com.tools20022.repository.codeset.TradeType3Code.BondSubstitution, com.tools20022.repository.codeset.TradeType3Code.FutureBuyBackTrade,
						com.tools20022.repository.codeset.TradeType3Code.Options, com.tools20022.repository.codeset.TradeType3Code.FuturesOption, com.tools20022.repository.codeset.TradeType3Code.Futures);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Basket.getCodeName().get(), Basket);
		codesByName.put(Index.getCodeName().get(), Index);
		codesByName.put(IPO.getCodeName().get(), IPO);
		codesByName.put(List.getCodeName().get(), List);
		codesByName.put(PreAllocation.getCodeName().get(), PreAllocation);
		codesByName.put(Program.getCodeName().get(), Program);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(BrokerToBroker.getCodeName().get(), BrokerToBroker);
		codesByName.put(RiskTrade.getCodeName().get(), RiskTrade);
		codesByName.put(VWAPGuarantee.getCodeName().get(), VWAPGuarantee);
		codesByName.put(Agency.getCodeName().get(), Agency);
		codesByName.put(GuaranteedClose.getCodeName().get(), GuaranteedClose);
		codesByName.put(EmployeeTradeReporting.getCodeName().get(), EmployeeTradeReporting);
		codesByName.put(Issuance.getCodeName().get(), Issuance);
		codesByName.put(BondStart.getCodeName().get(), BondStart);
		codesByName.put(BondEnd.getCodeName().get(), BondEnd);
		codesByName.put(LendingAndBorrowing.getCodeName().get(), LendingAndBorrowing);
		codesByName.put(BondRepricing.getCodeName().get(), BondRepricing);
		codesByName.put(OfferingIssuingTrade.getCodeName().get(), OfferingIssuingTrade);
		codesByName.put(BondSubstitution.getCodeName().get(), BondSubstitution);
		codesByName.put(FutureBuyBackTrade.getCodeName().get(), FutureBuyBackTrade);
		codesByName.put(Options.getCodeName().get(), Options);
		codesByName.put(FuturesOption.getCodeName().get(), FuturesOption);
		codesByName.put(Futures.getCodeName().get(), Futures);
	}

	public static TradeType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeType3Code[] values() {
		TradeType3Code[] values = new TradeType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeType3Code> {
		@Override
		public TradeType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}