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
import com.tools20022.repository.codeset.TradingMethodType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code#BilateralTrade
 * TradingMethodType1Code.BilateralTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code#CentralizedPriceBidding
 * TradingMethodType1Code.CentralizedPriceBidding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code#ContinuousMatching
 * TradingMethodType1Code.ContinuousMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code#LimitOrder
 * TradingMethodType1Code.LimitOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code#NegotiationTrade
 * TradingMethodType1Code.NegotiationTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code#OneClickTrade
 * TradingMethodType1Code.OneClickTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code#QuotationAuction
 * TradingMethodType1Code.QuotationAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code#TenderingAuction
 * TradingMethodType1Code.TenderingAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code#AnonymousClick
 * TradingMethodType1Code.AnonymousClick}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradingMethodTypeCode
 * TradingMethodTypeCode}</li>
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
 * "TradingMethodType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of trading method."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingMethodType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralTrade"</li>
	 * </ul>
	 */
	public static final TradingMethodType1Code BilateralTrade = new TradingMethodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodType1Code.mmObject();
			codeName = TradingMethodTypeCode.BilateralTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralizedPriceBidding"</li>
	 * </ul>
	 */
	public static final TradingMethodType1Code CentralizedPriceBidding = new TradingMethodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralizedPriceBidding";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodType1Code.mmObject();
			codeName = TradingMethodTypeCode.CentralizedPriceBidding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContinuousMatching"</li>
	 * </ul>
	 */
	public static final TradingMethodType1Code ContinuousMatching = new TradingMethodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContinuousMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodType1Code.mmObject();
			codeName = TradingMethodTypeCode.ContinuousMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitOrder"</li>
	 * </ul>
	 */
	public static final TradingMethodType1Code LimitOrder = new TradingMethodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodType1Code.mmObject();
			codeName = TradingMethodTypeCode.LimitOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiationTrade"</li>
	 * </ul>
	 */
	public static final TradingMethodType1Code NegotiationTrade = new TradingMethodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiationTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodType1Code.mmObject();
			codeName = TradingMethodTypeCode.NegotiationTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneClickTrade"</li>
	 * </ul>
	 */
	public static final TradingMethodType1Code OneClickTrade = new TradingMethodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneClickTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodType1Code.mmObject();
			codeName = TradingMethodTypeCode.OneClickTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationAuction"</li>
	 * </ul>
	 */
	public static final TradingMethodType1Code QuotationAuction = new TradingMethodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationAuction";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodType1Code.mmObject();
			codeName = TradingMethodTypeCode.QuotationAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderingAuction"</li>
	 * </ul>
	 */
	public static final TradingMethodType1Code TenderingAuction = new TradingMethodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderingAuction";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodType1Code.mmObject();
			codeName = TradingMethodTypeCode.TenderingAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingMethodType1Code
	 * TradingMethodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnonymousClick"</li>
	 * </ul>
	 */
	public static final TradingMethodType1Code AnonymousClick = new TradingMethodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnonymousClick";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingMethodType1Code.mmObject();
			codeName = TradingMethodTypeCode.AnonymousClick.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradingMethodType1Code> codesByName = new LinkedHashMap<>();

	protected TradingMethodType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingMethodType1Code";
				definition = "Identifies the type of trading method.";
				trace_lazy = () -> TradingMethodTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingMethodType1Code.BilateralTrade, com.tools20022.repository.codeset.TradingMethodType1Code.CentralizedPriceBidding,
						com.tools20022.repository.codeset.TradingMethodType1Code.ContinuousMatching, com.tools20022.repository.codeset.TradingMethodType1Code.LimitOrder,
						com.tools20022.repository.codeset.TradingMethodType1Code.NegotiationTrade, com.tools20022.repository.codeset.TradingMethodType1Code.OneClickTrade,
						com.tools20022.repository.codeset.TradingMethodType1Code.QuotationAuction, com.tools20022.repository.codeset.TradingMethodType1Code.TenderingAuction,
						com.tools20022.repository.codeset.TradingMethodType1Code.AnonymousClick);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BilateralTrade.getCodeName().get(), BilateralTrade);
		codesByName.put(CentralizedPriceBidding.getCodeName().get(), CentralizedPriceBidding);
		codesByName.put(ContinuousMatching.getCodeName().get(), ContinuousMatching);
		codesByName.put(LimitOrder.getCodeName().get(), LimitOrder);
		codesByName.put(NegotiationTrade.getCodeName().get(), NegotiationTrade);
		codesByName.put(OneClickTrade.getCodeName().get(), OneClickTrade);
		codesByName.put(QuotationAuction.getCodeName().get(), QuotationAuction);
		codesByName.put(TenderingAuction.getCodeName().get(), TenderingAuction);
		codesByName.put(AnonymousClick.getCodeName().get(), AnonymousClick);
	}

	public static TradingMethodType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingMethodType1Code[] values() {
		TradingMethodType1Code[] values = new TradingMethodType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingMethodType1Code> {
		@Override
		public TradingMethodType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingMethodType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}