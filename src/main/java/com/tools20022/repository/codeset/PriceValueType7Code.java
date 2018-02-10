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
import com.tools20022.repository.codeset.PriceValueType7Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of value of the price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#Discount
 * PriceValueType7Code.Discount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#Premium
 * PriceValueType7Code.Premium}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueType7Code#Par
 * PriceValueType7Code.Par}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueType7Code#Yield
 * PriceValueType7Code.Yield}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceValueType7Code#Spread
 * PriceValueType7Code.Spread}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#PerUnit
 * PriceValueType7Code.PerUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#Absolute
 * PriceValueType7Code.Absolute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#TEDPrice
 * PriceValueType7Code.TEDPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#TEDYield
 * PriceValueType7Code.TEDYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#FixedCabinetTrade
 * PriceValueType7Code.FixedCabinetTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#VariableCabinetTrade
 * PriceValueType7Code.VariableCabinetTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#Percentage
 * PriceValueType7Code.Percentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code#ActualAmount
 * PriceValueType7Code.ActualAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
 * PriceValueTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DISC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceValueType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies a type of value of the price."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceValueType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discount"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code Discount = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discount";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.Discount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Premium"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code Premium = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Premium";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.Premium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Par"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code Par = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Par";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.Par.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code Yield = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yield";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.Yield.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code Spread = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Spread";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.Spread.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code PerUnit = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.PerUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Absolute"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code Absolute = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Absolute";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.Absolute.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEDPrice"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code TEDPrice = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TEDPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.TEDPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEDYield"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code TEDYield = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TEDYield";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.TEDYield.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixedCabinetTrade"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code FixedCabinetTrade = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FixedCabinetTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.FixedCabinetTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableCabinetTrade"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code VariableCabinetTrade = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableCabinetTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.VariableCabinetTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code Percentage = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.Percentage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType7Code
	 * PriceValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualAmount"</li>
	 * </ul>
	 */
	public static final PriceValueType7Code ActualAmount = new PriceValueType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceValueType7Code.mmObject();
			codeName = PriceValueTypeCode.ActualAmount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PriceValueType7Code> codesByName = new LinkedHashMap<>();

	protected PriceValueType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DISC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceValueType7Code";
				definition = "Specifies a type of value of the price.";
				trace_lazy = () -> PriceValueTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceValueType7Code.Discount, com.tools20022.repository.codeset.PriceValueType7Code.Premium, com.tools20022.repository.codeset.PriceValueType7Code.Par,
						com.tools20022.repository.codeset.PriceValueType7Code.Yield, com.tools20022.repository.codeset.PriceValueType7Code.Spread, com.tools20022.repository.codeset.PriceValueType7Code.PerUnit,
						com.tools20022.repository.codeset.PriceValueType7Code.Absolute, com.tools20022.repository.codeset.PriceValueType7Code.TEDPrice, com.tools20022.repository.codeset.PriceValueType7Code.TEDYield,
						com.tools20022.repository.codeset.PriceValueType7Code.FixedCabinetTrade, com.tools20022.repository.codeset.PriceValueType7Code.VariableCabinetTrade, com.tools20022.repository.codeset.PriceValueType7Code.Percentage,
						com.tools20022.repository.codeset.PriceValueType7Code.ActualAmount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Discount.getCodeName().get(), Discount);
		codesByName.put(Premium.getCodeName().get(), Premium);
		codesByName.put(Par.getCodeName().get(), Par);
		codesByName.put(Yield.getCodeName().get(), Yield);
		codesByName.put(Spread.getCodeName().get(), Spread);
		codesByName.put(PerUnit.getCodeName().get(), PerUnit);
		codesByName.put(Absolute.getCodeName().get(), Absolute);
		codesByName.put(TEDPrice.getCodeName().get(), TEDPrice);
		codesByName.put(TEDYield.getCodeName().get(), TEDYield);
		codesByName.put(FixedCabinetTrade.getCodeName().get(), FixedCabinetTrade);
		codesByName.put(VariableCabinetTrade.getCodeName().get(), VariableCabinetTrade);
		codesByName.put(Percentage.getCodeName().get(), Percentage);
		codesByName.put(ActualAmount.getCodeName().get(), ActualAmount);
	}

	public static PriceValueType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceValueType7Code[] values() {
		PriceValueType7Code[] values = new PriceValueType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceValueType7Code> {
		@Override
		public PriceValueType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceValueType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}