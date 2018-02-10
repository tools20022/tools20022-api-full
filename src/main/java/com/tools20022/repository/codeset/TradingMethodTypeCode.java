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
import com.tools20022.repository.codeset.TradingMethodTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of trading method.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#CentralizedPriceBidding
 * TradingMethodTypeCode.CentralizedPriceBidding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#ContinuousMatching
 * TradingMethodTypeCode.ContinuousMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#BilateralTrade
 * TradingMethodTypeCode.BilateralTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#OneClickTrade
 * TradingMethodTypeCode.OneClickTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#LimitOrder
 * TradingMethodTypeCode.LimitOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#NegotiationTrade
 * TradingMethodTypeCode.NegotiationTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#QuotationAuction
 * TradingMethodTypeCode.QuotationAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#TenderingAuction
 * TradingMethodTypeCode.TenderingAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode#AnonymousClick
 * TradingMethodTypeCode.AnonymousClick}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
 * TradingMethodType1Code}</li>
 * </ul>
 * </li>
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
 * "TradingMethodTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of trading method."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingMethodTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Members submit orders, and trading system uses matchmaking mechanism of
	 * Centralized Price Bidding to match orders.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralizedPriceBidding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Members submit orders, and trading system uses matchmaking mechanism of Centralized Price Bidding to match orders.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final TradingMethodTypeCode CentralizedPriceBidding = new TradingMethodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralizedPriceBidding";
			definition = "Members submit orders, and trading system uses matchmaking mechanism of Centralized Price Bidding to match orders.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodTypeCode.mmObject();
			codeName = "CERB";
		}
	};
	/**
	 * Members submit orders, and trading system uses continuous matchmaking
	 * mechanism to match orders.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContinuousMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Members submit orders, and trading system uses continuous matchmaking mechanism to match orders.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final TradingMethodTypeCode ContinuousMatching = new TradingMethodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContinuousMatching";
			definition = "Members submit orders, and trading system uses continuous matchmaking mechanism to match orders.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodTypeCode.mmObject();
			codeName = "CUMA";
		}
	};
	/**
	 * Taker submits a bilateral request, maker replys the quotation, and taker
	 * accepts the quotation to complete a bilateral trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BITR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taker submits a bilateral request, maker replys the quotation, and taker accepts the quotation to complete a bilateral trade."
	 * </li>
	 * </ul>
	 */
	public static final TradingMethodTypeCode BilateralTrade = new TradingMethodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralTrade";
			definition = "Taker submits a bilateral request, maker replys the quotation, and taker accepts the quotation to complete a bilateral trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodTypeCode.mmObject();
			codeName = "BITR";
		}
	};
	/**
	 * When market makers quote continuously, members could just click the
	 * quotation to make a deal with market makers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneClickTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When market makers quote continuously, members could just click the quotation to make a deal with market makers."
	 * </li>
	 * </ul>
	 */
	public static final TradingMethodTypeCode OneClickTrade = new TradingMethodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneClickTrade";
			definition = "When market makers quote continuously, members could just click the quotation to make a deal with market makers.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodTypeCode.mmObject();
			codeName = "ONCT";
		}
	};
	/**
	 * Member activate an order, and if order matches with market maker's
	 * quotationa, the order will be filled automatically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member activate an order, and if order matches with market maker's quotationa, the order will be filled automatically."
	 * </li>
	 * </ul>
	 */
	public static final TradingMethodTypeCode LimitOrder = new TradingMethodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitOrder";
			definition = "Member activate an order, and if order matches with market maker's quotationa, the order will be filled automatically.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodTypeCode.mmObject();
			codeName = "LIOR";
		}
	};
	/**
	 * Member completes product elements and submits, and the counterpart just
	 * confirms the deal to complete a negotiation trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiationTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Member completes product elements and submits, and the counterpart just confirms the deal to complete a negotiation trade."
	 * </li>
	 * </ul>
	 */
	public static final TradingMethodTypeCode NegotiationTrade = new TradingMethodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiationTrade";
			definition = "Member completes product elements and submits, and the counterpart just confirms the deal to complete a negotiation trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodTypeCode.mmObject();
			codeName = "NETR";
		}
	};
	/**
	 * Market members can click the predetermined price setted by issuer to make
	 * a deal， and then the subscription amount will deduct in time.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market members can click the predetermined price setted by issuer to make a deal， and then the subscription amount will deduct in time.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final TradingMethodTypeCode QuotationAuction = new TradingMethodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationAuction";
			definition = "Market members can click the predetermined price setted by issuer to make a deal， and then the subscription amount will deduct in time.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodTypeCode.mmObject();
			codeName = "QUAU";
		}
	};
	/**
	 * Administrator reviews the deposit that filled by issuer, and sends it to
	 * the tenderers as reference. Atfer this, the issuer confirms the tendering
	 * result.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderingAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Administrator reviews the deposit that filled by issuer, and sends it to the tenderers as reference. Atfer this, the issuer confirms the tendering result.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final TradingMethodTypeCode TenderingAuction = new TradingMethodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderingAuction";
			definition = "Administrator reviews the deposit that filled by issuer, and sends it to the tenderers as reference. Atfer this, the issuer confirms the tendering result.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodTypeCode.mmObject();
			codeName = "TEAU";
		}
	};
	/**
	 * Trades are executed any click anonymously.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
	 * TradingMethodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnonymousClick"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trades are executed any click anonymously."</li>
	 * </ul>
	 */
	public static final TradingMethodTypeCode AnonymousClick = new TradingMethodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnonymousClick";
			definition = "Trades are executed any click anonymously.";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodTypeCode.mmObject();
			codeName = "ANCL";
		}
	};
	final static private LinkedHashMap<String, TradingMethodTypeCode> codesByName = new LinkedHashMap<>();

	protected TradingMethodTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingMethodTypeCode";
				definition = "Identifies the type of trading method.";
				derivation_lazy = () -> Arrays.asList(TradingMethodType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingMethodTypeCode.CentralizedPriceBidding, com.tools20022.repository.codeset.TradingMethodTypeCode.ContinuousMatching,
						com.tools20022.repository.codeset.TradingMethodTypeCode.BilateralTrade, com.tools20022.repository.codeset.TradingMethodTypeCode.OneClickTrade, com.tools20022.repository.codeset.TradingMethodTypeCode.LimitOrder,
						com.tools20022.repository.codeset.TradingMethodTypeCode.NegotiationTrade, com.tools20022.repository.codeset.TradingMethodTypeCode.QuotationAuction,
						com.tools20022.repository.codeset.TradingMethodTypeCode.TenderingAuction, com.tools20022.repository.codeset.TradingMethodTypeCode.AnonymousClick);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CentralizedPriceBidding.getCodeName().get(), CentralizedPriceBidding);
		codesByName.put(ContinuousMatching.getCodeName().get(), ContinuousMatching);
		codesByName.put(BilateralTrade.getCodeName().get(), BilateralTrade);
		codesByName.put(OneClickTrade.getCodeName().get(), OneClickTrade);
		codesByName.put(LimitOrder.getCodeName().get(), LimitOrder);
		codesByName.put(NegotiationTrade.getCodeName().get(), NegotiationTrade);
		codesByName.put(QuotationAuction.getCodeName().get(), QuotationAuction);
		codesByName.put(TenderingAuction.getCodeName().get(), TenderingAuction);
		codesByName.put(AnonymousClick.getCodeName().get(), AnonymousClick);
	}

	public static TradingMethodTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingMethodTypeCode[] values() {
		TradingMethodTypeCode[] values = new TradingMethodTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingMethodTypeCode> {
		@Override
		public TradingMethodTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingMethodTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}