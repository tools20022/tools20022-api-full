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
import com.tools20022.repository.codeset.PegType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates a type of instruction to a broker or dealer to buy or sell a
 * financial instrument which is pegged against a certain value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PegType1Code#Fixed
 * PegType1Code.Fixed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegType1Code#Last
 * PegType1Code.Last}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegType1Code#Market
 * PegType1Code.Market}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegType1Code#MidPrice
 * PegType1Code.MidPrice}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegType1Code#Opening
 * PegType1Code.Opening}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PegType1Code#Primary
 * PegType1Code.Primary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PegType1Code#VolumeWeightAveragePrice
 * PegType1Code.VolumeWeightAveragePrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PegTypeCode PegTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FIXE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PegType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates a type of instruction to a broker or dealer to buy or sell a financial instrument which is pegged against a certain value."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PegType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegType1Code PegType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fixed"</li>
	 * </ul>
	 */
	public static final PegType1Code Fixed = new PegType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fixed";
			owner_lazy = () -> com.tools20022.repository.codeset.PegType1Code.mmObject();
			codeName = PegTypeCode.Fixed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegType1Code PegType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Last"</li>
	 * </ul>
	 */
	public static final PegType1Code Last = new PegType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Last";
			owner_lazy = () -> com.tools20022.repository.codeset.PegType1Code.mmObject();
			codeName = PegTypeCode.Last.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegType1Code PegType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * </ul>
	 */
	public static final PegType1Code Market = new PegType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Market";
			owner_lazy = () -> com.tools20022.repository.codeset.PegType1Code.mmObject();
			codeName = PegTypeCode.Market.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegType1Code PegType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidPrice"</li>
	 * </ul>
	 */
	public static final PegType1Code MidPrice = new PegType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.PegType1Code.mmObject();
			codeName = PegTypeCode.MidPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegType1Code PegType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opening"</li>
	 * </ul>
	 */
	public static final PegType1Code Opening = new PegType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opening";
			owner_lazy = () -> com.tools20022.repository.codeset.PegType1Code.mmObject();
			codeName = PegTypeCode.Opening.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegType1Code PegType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Primary"</li>
	 * </ul>
	 */
	public static final PegType1Code Primary = new PegType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Primary";
			owner_lazy = () -> com.tools20022.repository.codeset.PegType1Code.mmObject();
			codeName = PegTypeCode.Primary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PegType1Code PegType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolumeWeightAveragePrice"</li>
	 * </ul>
	 */
	public static final PegType1Code VolumeWeightAveragePrice = new PegType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolumeWeightAveragePrice";
			owner_lazy = () -> com.tools20022.repository.codeset.PegType1Code.mmObject();
			codeName = PegTypeCode.VolumeWeightAveragePrice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PegType1Code> codesByName = new LinkedHashMap<>();

	protected PegType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FIXE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PegType1Code";
				definition = "Indicates a type of instruction to a broker or dealer to buy or sell a financial instrument which is pegged against a certain value.";
				trace_lazy = () -> PegTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PegType1Code.Fixed, com.tools20022.repository.codeset.PegType1Code.Last, com.tools20022.repository.codeset.PegType1Code.Market,
						com.tools20022.repository.codeset.PegType1Code.MidPrice, com.tools20022.repository.codeset.PegType1Code.Opening, com.tools20022.repository.codeset.PegType1Code.Primary,
						com.tools20022.repository.codeset.PegType1Code.VolumeWeightAveragePrice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fixed.getCodeName().get(), Fixed);
		codesByName.put(Last.getCodeName().get(), Last);
		codesByName.put(Market.getCodeName().get(), Market);
		codesByName.put(MidPrice.getCodeName().get(), MidPrice);
		codesByName.put(Opening.getCodeName().get(), Opening);
		codesByName.put(Primary.getCodeName().get(), Primary);
		codesByName.put(VolumeWeightAveragePrice.getCodeName().get(), VolumeWeightAveragePrice);
	}

	public static PegType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PegType1Code[] values() {
		PegType1Code[] values = new PegType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PegType1Code> {
		@Override
		public PegType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PegType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}