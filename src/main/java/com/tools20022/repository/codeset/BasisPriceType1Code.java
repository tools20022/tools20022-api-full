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
import com.tools20022.repository.codeset.BasisPriceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Basis price type in a bid order. Used for list trading.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code#MorningSessionClosePrice
 * BasisPriceType1Code.MorningSessionClosePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code#ClosingPrice
 * BasisPriceType1Code.ClosingPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code#CurrentPrice
 * BasisPriceType1Code.CurrentPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code#SpecialQuotation
 * BasisPriceType1Code.SpecialQuotation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code#VWAPDay
 * BasisPriceType1Code.VWAPDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code#VWAPMorning
 * BasisPriceType1Code.VWAPMorning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code#VWAPAfternoon
 * BasisPriceType1Code.VWAPAfternoon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code#StrikePrice
 * BasisPriceType1Code.StrikePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code#OpenPrice
 * BasisPriceType1Code.OpenPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BasisPriceTypeCode
 * BasisPriceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MSCP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BasisPriceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Basis price type in a bid order. Used for list trading."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BasisPriceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code
	 * BasisPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MorningSessionClosePrice"</li>
	 * </ul>
	 */
	public static final BasisPriceType1Code MorningSessionClosePrice = new BasisPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MorningSessionClosePrice";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceType1Code.mmObject();
			codeName = BasisPriceTypeCode.MorningSessionClosePrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code
	 * BasisPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingPrice"</li>
	 * </ul>
	 */
	public static final BasisPriceType1Code ClosingPrice = new BasisPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceType1Code.mmObject();
			codeName = BasisPriceTypeCode.ClosingPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code
	 * BasisPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentPrice"</li>
	 * </ul>
	 */
	public static final BasisPriceType1Code CurrentPrice = new BasisPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceType1Code.mmObject();
			codeName = BasisPriceTypeCode.CurrentPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code
	 * BasisPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialQuotation"</li>
	 * </ul>
	 */
	public static final BasisPriceType1Code SpecialQuotation = new BasisPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialQuotation";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceType1Code.mmObject();
			codeName = BasisPriceTypeCode.SpecialQuotation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code
	 * BasisPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPDay"</li>
	 * </ul>
	 */
	public static final BasisPriceType1Code VWAPDay = new BasisPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VWAPDay";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceType1Code.mmObject();
			codeName = BasisPriceTypeCode.VWAPDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code
	 * BasisPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPMorning"</li>
	 * </ul>
	 */
	public static final BasisPriceType1Code VWAPMorning = new BasisPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VWAPMorning";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceType1Code.mmObject();
			codeName = BasisPriceTypeCode.VWAPMorning.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code
	 * BasisPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPAfternoon"</li>
	 * </ul>
	 */
	public static final BasisPriceType1Code VWAPAfternoon = new BasisPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VWAPAfternoon";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceType1Code.mmObject();
			codeName = BasisPriceTypeCode.VWAPAfternoon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code
	 * BasisPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikePrice"</li>
	 * </ul>
	 */
	public static final BasisPriceType1Code StrikePrice = new BasisPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikePrice";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceType1Code.mmObject();
			codeName = BasisPriceTypeCode.StrikePrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BasisPriceType1Code
	 * BasisPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenPrice"</li>
	 * </ul>
	 */
	public static final BasisPriceType1Code OpenPrice = new BasisPriceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.BasisPriceType1Code.mmObject();
			codeName = BasisPriceTypeCode.OpenPrice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BasisPriceType1Code> codesByName = new LinkedHashMap<>();

	protected BasisPriceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MSCP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BasisPriceType1Code";
				definition = "Basis price type in a bid order. Used for list trading.";
				trace_lazy = () -> BasisPriceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BasisPriceType1Code.MorningSessionClosePrice, com.tools20022.repository.codeset.BasisPriceType1Code.ClosingPrice,
						com.tools20022.repository.codeset.BasisPriceType1Code.CurrentPrice, com.tools20022.repository.codeset.BasisPriceType1Code.SpecialQuotation, com.tools20022.repository.codeset.BasisPriceType1Code.VWAPDay,
						com.tools20022.repository.codeset.BasisPriceType1Code.VWAPMorning, com.tools20022.repository.codeset.BasisPriceType1Code.VWAPAfternoon, com.tools20022.repository.codeset.BasisPriceType1Code.StrikePrice,
						com.tools20022.repository.codeset.BasisPriceType1Code.OpenPrice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MorningSessionClosePrice.getCodeName().get(), MorningSessionClosePrice);
		codesByName.put(ClosingPrice.getCodeName().get(), ClosingPrice);
		codesByName.put(CurrentPrice.getCodeName().get(), CurrentPrice);
		codesByName.put(SpecialQuotation.getCodeName().get(), SpecialQuotation);
		codesByName.put(VWAPDay.getCodeName().get(), VWAPDay);
		codesByName.put(VWAPMorning.getCodeName().get(), VWAPMorning);
		codesByName.put(VWAPAfternoon.getCodeName().get(), VWAPAfternoon);
		codesByName.put(StrikePrice.getCodeName().get(), StrikePrice);
		codesByName.put(OpenPrice.getCodeName().get(), OpenPrice);
	}

	public static BasisPriceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BasisPriceType1Code[] values() {
		BasisPriceType1Code[] values = new BasisPriceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BasisPriceType1Code> {
		@Override
		public BasisPriceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BasisPriceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}