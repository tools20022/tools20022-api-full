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
import com.tools20022.repository.codeset.LiquidityLimitType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the precise type of liquidity management limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitType1Code#Global
 * LiquidityLimitType1Code.Global}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitType1Code#CashReservation
 * LiquidityLimitType1Code.CashReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitType1Code#CriticalPaymentReservation
 * LiquidityLimitType1Code.CriticalPaymentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitType1Code#NetSSSReservation
 * LiquidityLimitType1Code.NetSSSReservation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitTypeCode
 * LiquidityLimitTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GLBL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityLimitType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the precise type of liquidity management limit."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LiquidityLimitType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitType1Code
	 * LiquidityLimitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * </ul>
	 */
	public static final LiquidityLimitType1Code Global = new LiquidityLimitType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityLimitType1Code.mmObject();
			codeName = LiquidityLimitTypeCode.Global.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitType1Code
	 * LiquidityLimitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashReservation"</li>
	 * </ul>
	 */
	public static final LiquidityLimitType1Code CashReservation = new LiquidityLimitType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservation";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityLimitType1Code.mmObject();
			codeName = LiquidityLimitTypeCode.CashReservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitType1Code
	 * LiquidityLimitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CriticalPaymentReservation"</li>
	 * </ul>
	 */
	public static final LiquidityLimitType1Code CriticalPaymentReservation = new LiquidityLimitType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CriticalPaymentReservation";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityLimitType1Code.mmObject();
			codeName = LiquidityLimitTypeCode.CriticalPaymentReservation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityLimitType1Code
	 * LiquidityLimitType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetSSSReservation"</li>
	 * </ul>
	 */
	public static final LiquidityLimitType1Code NetSSSReservation = new LiquidityLimitType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetSSSReservation";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityLimitType1Code.mmObject();
			codeName = LiquidityLimitTypeCode.NetSSSReservation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LiquidityLimitType1Code> codesByName = new LinkedHashMap<>();

	protected LiquidityLimitType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GLBL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LiquidityLimitType1Code";
				definition = "Specifies the precise type of liquidity management limit.";
				trace_lazy = () -> LiquidityLimitTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LiquidityLimitType1Code.Global, com.tools20022.repository.codeset.LiquidityLimitType1Code.CashReservation,
						com.tools20022.repository.codeset.LiquidityLimitType1Code.CriticalPaymentReservation, com.tools20022.repository.codeset.LiquidityLimitType1Code.NetSSSReservation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Global.getCodeName().get(), Global);
		codesByName.put(CashReservation.getCodeName().get(), CashReservation);
		codesByName.put(CriticalPaymentReservation.getCodeName().get(), CriticalPaymentReservation);
		codesByName.put(NetSSSReservation.getCodeName().get(), NetSSSReservation);
	}

	public static LiquidityLimitType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LiquidityLimitType1Code[] values() {
		LiquidityLimitType1Code[] values = new LiquidityLimitType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LiquidityLimitType1Code> {
		@Override
		public LiquidityLimitType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LiquidityLimitType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}