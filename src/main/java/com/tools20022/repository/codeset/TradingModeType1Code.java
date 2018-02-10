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
import com.tools20022.repository.codeset.TradingModeType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of the trading mode.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code#QuotationDriven
 * TradingModeType1Code.QuotationDriven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code#OrderDriven
 * TradingModeType1Code.OrderDriven}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code#NegotiationTrade
 * TradingModeType1Code.NegotiationTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code#Auction
 * TradingModeType1Code.Auction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code#Matching
 * TradingModeType1Code.Matching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code#Bilateral
 * TradingModeType1Code.Bilateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code#Anonymous
 * TradingModeType1Code.Anonymous}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradingModeTypeCode
 * TradingModeTypeCode}</li>
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
 * "TradingModeType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of the trading mode."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradingModeType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDriven"</li>
	 * </ul>
	 */
	public static final TradingModeType1Code QuotationDriven = new TradingModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDriven";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingModeType1Code.mmObject();
			codeName = TradingModeTypeCode.QuotationDriven.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDriven"</li>
	 * </ul>
	 */
	public static final TradingModeType1Code OrderDriven = new TradingModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDriven";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingModeType1Code.mmObject();
			codeName = TradingModeTypeCode.OrderDriven.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiationTrade"</li>
	 * </ul>
	 */
	public static final TradingModeType1Code NegotiationTrade = new TradingModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiationTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingModeType1Code.mmObject();
			codeName = TradingModeTypeCode.NegotiationTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Auction"</li>
	 * </ul>
	 */
	public static final TradingModeType1Code Auction = new TradingModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Auction";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingModeType1Code.mmObject();
			codeName = TradingModeTypeCode.Auction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matching"</li>
	 * </ul>
	 */
	public static final TradingModeType1Code Matching = new TradingModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matching";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingModeType1Code.mmObject();
			codeName = TradingModeTypeCode.Matching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bilateral"</li>
	 * </ul>
	 */
	public static final TradingModeType1Code Bilateral = new TradingModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bilateral";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingModeType1Code.mmObject();
			codeName = TradingModeTypeCode.Bilateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Anonymous"</li>
	 * </ul>
	 */
	public static final TradingModeType1Code Anonymous = new TradingModeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Anonymous";
			owner_lazy = () -> com.tools20022.repository.codeset.TradingModeType1Code.mmObject();
			codeName = TradingModeTypeCode.Anonymous.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradingModeType1Code> codesByName = new LinkedHashMap<>();

	protected TradingModeType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingModeType1Code";
				definition = "Identifies the type of the trading mode.";
				trace_lazy = () -> TradingModeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradingModeType1Code.QuotationDriven, com.tools20022.repository.codeset.TradingModeType1Code.OrderDriven,
						com.tools20022.repository.codeset.TradingModeType1Code.NegotiationTrade, com.tools20022.repository.codeset.TradingModeType1Code.Auction, com.tools20022.repository.codeset.TradingModeType1Code.Matching,
						com.tools20022.repository.codeset.TradingModeType1Code.Bilateral, com.tools20022.repository.codeset.TradingModeType1Code.Anonymous);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(QuotationDriven.getCodeName().get(), QuotationDriven);
		codesByName.put(OrderDriven.getCodeName().get(), OrderDriven);
		codesByName.put(NegotiationTrade.getCodeName().get(), NegotiationTrade);
		codesByName.put(Auction.getCodeName().get(), Auction);
		codesByName.put(Matching.getCodeName().get(), Matching);
		codesByName.put(Bilateral.getCodeName().get(), Bilateral);
		codesByName.put(Anonymous.getCodeName().get(), Anonymous);
	}

	public static TradingModeType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradingModeType1Code[] values() {
		TradingModeType1Code[] values = new TradingModeType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradingModeType1Code> {
		@Override
		public TradingModeType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradingModeType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}