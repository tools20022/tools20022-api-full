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
import com.tools20022.repository.codeset.TradeType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of executed order in a bidding process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType2Code#RiskTrade
 * TradeType2Code.RiskTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType2Code#VWAPGuarantee
 * TradeType2Code.VWAPGuarantee}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TradeType2Code#Agency
 * TradeType2Code.Agency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeType2Code#GuaranteedClose
 * TradeType2Code.GuaranteedClose}</li>
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
 * <li>"RISK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of executed order in a bidding process."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType2Code
	 * TradeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskTrade"</li>
	 * </ul>
	 */
	public static final TradeType2Code RiskTrade = new TradeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RiskTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType2Code.mmObject();
			codeName = TradeTypeCode.RiskTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType2Code
	 * TradeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPGuarantee"</li>
	 * </ul>
	 */
	public static final TradeType2Code VWAPGuarantee = new TradeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VWAPGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType2Code.mmObject();
			codeName = TradeTypeCode.VWAPGuarantee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType2Code
	 * TradeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agency"</li>
	 * </ul>
	 */
	public static final TradeType2Code Agency = new TradeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agency";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType2Code.mmObject();
			codeName = TradeTypeCode.Agency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType2Code
	 * TradeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedClose"</li>
	 * </ul>
	 */
	public static final TradeType2Code GuaranteedClose = new TradeType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedClose";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeType2Code.mmObject();
			codeName = TradeTypeCode.GuaranteedClose.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeType2Code> codesByName = new LinkedHashMap<>();

	protected TradeType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RISK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeType2Code";
				definition = "Specifies the type of executed order in a bidding process.";
				trace_lazy = () -> TradeTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeType2Code.RiskTrade, com.tools20022.repository.codeset.TradeType2Code.VWAPGuarantee, com.tools20022.repository.codeset.TradeType2Code.Agency,
						com.tools20022.repository.codeset.TradeType2Code.GuaranteedClose);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RiskTrade.getCodeName().get(), RiskTrade);
		codesByName.put(VWAPGuarantee.getCodeName().get(), VWAPGuarantee);
		codesByName.put(Agency.getCodeName().get(), Agency);
		codesByName.put(GuaranteedClose.getCodeName().get(), GuaranteedClose);
	}

	public static TradeType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeType2Code[] values() {
		TradeType2Code[] values = new TradeType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeType2Code> {
		@Override
		public TradeType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}