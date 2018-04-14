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
import com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Contains the type of price to which the discretion offset is related to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#DisplayedPrice
 * TypeOfDiscretionPrice1Code.DisplayedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#MarketPrice
 * TypeOfDiscretionPrice1Code.MarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#PrimaryPrice
 * TypeOfDiscretionPrice1Code.PrimaryPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#LocalPrimaryPrice
 * TypeOfDiscretionPrice1Code.LocalPrimaryPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#MidpointPrice
 * TypeOfDiscretionPrice1Code.MidpointPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#VolumeWeightedAveragePrice
 * TypeOfDiscretionPrice1Code.VolumeWeightedAveragePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code#AveragePriceGuarantee
 * TypeOfDiscretionPrice1Code.AveragePriceGuarantee}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
 * TypeOfDiscretionPriceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfDiscretionPrice1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Contains the type of price to which the discretion offset is related to."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DISP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfDiscretionPrice1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfDiscretionPrice1Code DisplayedPrice = new TypeOfDiscretionPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayedPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.mmObject();
			codeName = TypeOfDiscretionPriceCode.DisplayedPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfDiscretionPrice1Code MarketPrice = new TypeOfDiscretionPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.mmObject();
			codeName = TypeOfDiscretionPriceCode.MarketPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfDiscretionPrice1Code PrimaryPrice = new TypeOfDiscretionPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.mmObject();
			codeName = TypeOfDiscretionPriceCode.PrimaryPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LocalPrimaryPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfDiscretionPrice1Code LocalPrimaryPrice = new TypeOfDiscretionPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LocalPrimaryPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.mmObject();
			codeName = TypeOfDiscretionPriceCode.LocalPrimaryPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidpointPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfDiscretionPrice1Code MidpointPrice = new TypeOfDiscretionPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidpointPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.mmObject();
			codeName = TypeOfDiscretionPriceCode.MidpointPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolumeWeightedAveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfDiscretionPrice1Code VolumeWeightedAveragePrice = new TypeOfDiscretionPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightedAveragePrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.mmObject();
			codeName = TypeOfDiscretionPriceCode.VolumeWeightedAveragePrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code
	 * TypeOfDiscretionPrice1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePriceGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfDiscretionPrice1Code AveragePriceGuarantee = new TypeOfDiscretionPrice1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePriceGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.mmObject();
			codeName = TypeOfDiscretionPriceCode.AveragePriceGuarantee.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfDiscretionPrice1Code> codesByName = new LinkedHashMap<>();

	protected TypeOfDiscretionPrice1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DISP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfDiscretionPrice1Code";
				definition = "Contains the type of price to which the discretion offset is related to.";
				trace_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.DisplayedPrice, com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.MarketPrice,
						com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.PrimaryPrice, com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.LocalPrimaryPrice,
						com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.MidpointPrice, com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.VolumeWeightedAveragePrice,
						com.tools20022.repository.codeset.TypeOfDiscretionPrice1Code.AveragePriceGuarantee);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DisplayedPrice.getCodeName().get(), DisplayedPrice);
		codesByName.put(MarketPrice.getCodeName().get(), MarketPrice);
		codesByName.put(PrimaryPrice.getCodeName().get(), PrimaryPrice);
		codesByName.put(LocalPrimaryPrice.getCodeName().get(), LocalPrimaryPrice);
		codesByName.put(MidpointPrice.getCodeName().get(), MidpointPrice);
		codesByName.put(VolumeWeightedAveragePrice.getCodeName().get(), VolumeWeightedAveragePrice);
		codesByName.put(AveragePriceGuarantee.getCodeName().get(), AveragePriceGuarantee);
	}

	public static TypeOfDiscretionPrice1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfDiscretionPrice1Code[] values() {
		TypeOfDiscretionPrice1Code[] values = new TypeOfDiscretionPrice1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfDiscretionPrice1Code> {
		@Override
		public TypeOfDiscretionPrice1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfDiscretionPrice1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}