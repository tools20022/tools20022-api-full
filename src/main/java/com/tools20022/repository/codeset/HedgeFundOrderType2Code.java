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
import com.tools20022.repository.codeset.HedgeFundOrderType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code#NonUnitized
 * HedgeFundOrderType2Code.NonUnitized}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code#SidePocketComponent
 * HedgeFundOrderType2Code.SidePocketComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code#BedAndBreakfast
 * HedgeFundOrderType2Code.BedAndBreakfast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code#SidePocketOrder
 * HedgeFundOrderType2Code.SidePocketOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code#Unitized
 * HedgeFundOrderType2Code.Unitized}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code#TopUp
 * HedgeFundOrderType2Code.TopUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code#HoldBack
 * HedgeFundOrderType2Code.HoldBack}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FundOrderTypeCode
 * FundOrderTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HedgeFundOrderType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the investment fund order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NUNI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class HedgeFundOrderType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code
	 * HedgeFundOrderType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUnitized"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final HedgeFundOrderType2Code NonUnitized = new HedgeFundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUnitized";
			owner_lazy = () -> com.tools20022.repository.codeset.HedgeFundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.NonUnitized.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code
	 * HedgeFundOrderType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final HedgeFundOrderType2Code SidePocketComponent = new HedgeFundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketComponent";
			owner_lazy = () -> com.tools20022.repository.codeset.HedgeFundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.SidePocketComponent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code
	 * HedgeFundOrderType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BedAndBreakfast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final HedgeFundOrderType2Code BedAndBreakfast = new HedgeFundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BedAndBreakfast";
			owner_lazy = () -> com.tools20022.repository.codeset.HedgeFundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.BedAndBreakfast.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code
	 * HedgeFundOrderType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SidePocketOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final HedgeFundOrderType2Code SidePocketOrder = new HedgeFundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SidePocketOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.HedgeFundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.SidePocketOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code
	 * HedgeFundOrderType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unitized"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final HedgeFundOrderType2Code Unitized = new HedgeFundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unitized";
			owner_lazy = () -> com.tools20022.repository.codeset.HedgeFundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.Unitized.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code
	 * HedgeFundOrderType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TopUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final HedgeFundOrderType2Code TopUp = new HedgeFundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TopUp";
			owner_lazy = () -> com.tools20022.repository.codeset.HedgeFundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.TopUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.HedgeFundOrderType2Code
	 * HedgeFundOrderType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final HedgeFundOrderType2Code HoldBack = new HedgeFundOrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldBack";
			owner_lazy = () -> com.tools20022.repository.codeset.HedgeFundOrderType2Code.mmObject();
			codeName = FundOrderTypeCode.HoldBack.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, HedgeFundOrderType2Code> codesByName = new LinkedHashMap<>();

	protected HedgeFundOrderType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NUNI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HedgeFundOrderType2Code";
				definition = "Specifies the type of the investment fund order.";
				trace_lazy = () -> FundOrderTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.HedgeFundOrderType2Code.NonUnitized, com.tools20022.repository.codeset.HedgeFundOrderType2Code.SidePocketComponent,
						com.tools20022.repository.codeset.HedgeFundOrderType2Code.BedAndBreakfast, com.tools20022.repository.codeset.HedgeFundOrderType2Code.SidePocketOrder,
						com.tools20022.repository.codeset.HedgeFundOrderType2Code.Unitized, com.tools20022.repository.codeset.HedgeFundOrderType2Code.TopUp, com.tools20022.repository.codeset.HedgeFundOrderType2Code.HoldBack);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonUnitized.getCodeName().get(), NonUnitized);
		codesByName.put(SidePocketComponent.getCodeName().get(), SidePocketComponent);
		codesByName.put(BedAndBreakfast.getCodeName().get(), BedAndBreakfast);
		codesByName.put(SidePocketOrder.getCodeName().get(), SidePocketOrder);
		codesByName.put(Unitized.getCodeName().get(), Unitized);
		codesByName.put(TopUp.getCodeName().get(), TopUp);
		codesByName.put(HoldBack.getCodeName().get(), HoldBack);
	}

	public static HedgeFundOrderType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static HedgeFundOrderType2Code[] values() {
		HedgeFundOrderType2Code[] values = new HedgeFundOrderType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, HedgeFundOrderType2Code> {
		@Override
		public HedgeFundOrderType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(HedgeFundOrderType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}