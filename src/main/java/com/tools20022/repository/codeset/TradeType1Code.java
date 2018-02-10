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
import com.tools20022.repository.codeset.TradeType1Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType1Code#OnOrderBookTrade
 * TradeType1Code.OnOrderBookTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType1Code#OffOrderBookTrade
 * TradeType1Code.OffOrderBookTrade}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType1Code#BackUpTrade
 * TradeType1Code.BackUpTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType1Code#CorrectiveTrade
 * TradeType1Code.CorrectiveTrade}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType1Code#TradeGiveUp
 * TradeType1Code.TradeGiveUp}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType1Code#LinkedTrade
 * TradeType1Code.LinkedTrade}</li>
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
 * <li>"OOBK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of executed order."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType1Code
	 * TradeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnOrderBookTrade"</li>
	 * </ul>
	 */
	public static final TradeType1Code OnOrderBookTrade = new TradeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnOrderBookTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType1Code.mmObject();
			codeName = TradeTypeCode.OnOrderBookTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType1Code
	 * TradeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffOrderBookTrade"</li>
	 * </ul>
	 */
	public static final TradeType1Code OffOrderBookTrade = new TradeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffOrderBookTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType1Code.mmObject();
			codeName = TradeTypeCode.OffOrderBookTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType1Code
	 * TradeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackUpTrade"</li>
	 * </ul>
	 */
	public static final TradeType1Code BackUpTrade = new TradeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BackUpTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType1Code.mmObject();
			codeName = TradeTypeCode.BackUpTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType1Code
	 * TradeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorrectiveTrade"</li>
	 * </ul>
	 */
	public static final TradeType1Code CorrectiveTrade = new TradeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorrectiveTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType1Code.mmObject();
			codeName = TradeTypeCode.CorrectiveTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType1Code
	 * TradeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeGiveUp"</li>
	 * </ul>
	 */
	public static final TradeType1Code TradeGiveUp = new TradeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeGiveUp";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType1Code.mmObject();
			codeName = TradeTypeCode.TradeGiveUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType1Code
	 * TradeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedTrade"</li>
	 * </ul>
	 */
	public static final TradeType1Code LinkedTrade = new TradeType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType1Code.mmObject();
			codeName = TradeTypeCode.LinkedTrade.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeType1Code> codesByName = new LinkedHashMap<>();

	protected TradeType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OOBK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeType1Code";
				definition = "Specifies the type of executed order.";
				trace_lazy = () -> TradeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeType1Code.OnOrderBookTrade, com.tools20022.repository.codeset.TradeType1Code.OffOrderBookTrade,
						com.tools20022.repository.codeset.TradeType1Code.BackUpTrade, com.tools20022.repository.codeset.TradeType1Code.CorrectiveTrade, com.tools20022.repository.codeset.TradeType1Code.TradeGiveUp,
						com.tools20022.repository.codeset.TradeType1Code.LinkedTrade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OnOrderBookTrade.getCodeName().get(), OnOrderBookTrade);
		codesByName.put(OffOrderBookTrade.getCodeName().get(), OffOrderBookTrade);
		codesByName.put(BackUpTrade.getCodeName().get(), BackUpTrade);
		codesByName.put(CorrectiveTrade.getCodeName().get(), CorrectiveTrade);
		codesByName.put(TradeGiveUp.getCodeName().get(), TradeGiveUp);
		codesByName.put(LinkedTrade.getCodeName().get(), LinkedTrade);
	}

	public static TradeType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeType1Code[] values() {
		TradeType1Code[] values = new TradeType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeType1Code> {
		@Override
		public TradeType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}