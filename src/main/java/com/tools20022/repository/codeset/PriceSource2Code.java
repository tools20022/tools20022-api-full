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
import com.tools20022.repository.codeset.PriceSource2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the source of a price quotation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceSource2Code#Fund
 * PriceSource2Code.Fund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceSource2Code#Theoretical
 * PriceSource2Code.Theoretical}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceSource2Code#Vendor
 * PriceSource2Code.Vendor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceSource2Code#StockExchange
 * PriceSource2Code.StockExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PriceSourceCode
 * PriceSourceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FUND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceSource2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the source of a price quotation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.PriceSource1Code
 * PriceSource1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceSource2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource2Code
	 * PriceSource2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource1Code#Fund
	 * PriceSource1Code.Fund}</li>
	 * </ul>
	 */
	public static final PriceSource2Code Fund = new PriceSource2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fund";
			previousVersion_lazy = () -> PriceSource1Code.Fund;
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSource2Code.mmObject();
			codeName = PriceSourceCode.Fund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource2Code
	 * PriceSource2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Theoretical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource1Code#Theoretical
	 * PriceSource1Code.Theoretical}</li>
	 * </ul>
	 */
	public static final PriceSource2Code Theoretical = new PriceSource2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Theoretical";
			previousVersion_lazy = () -> PriceSource1Code.Theoretical;
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSource2Code.mmObject();
			codeName = PriceSourceCode.Theoretical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource2Code
	 * PriceSource2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vendor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource1Code#Vendor
	 * PriceSource1Code.Vendor}</li>
	 * </ul>
	 */
	public static final PriceSource2Code Vendor = new PriceSource2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vendor";
			previousVersion_lazy = () -> PriceSource1Code.Vendor;
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSource2Code.mmObject();
			codeName = PriceSourceCode.Vendor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource2Code
	 * PriceSource2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * </ul>
	 */
	public static final PriceSource2Code StockExchange = new PriceSource2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSource2Code.mmObject();
			codeName = PriceSourceCode.StockExchange.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PriceSource2Code> codesByName = new LinkedHashMap<>();

	protected PriceSource2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FUND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceSource2Code";
				definition = "Specifies the source of a price quotation.";
				previousVersion_lazy = () -> PriceSource1Code.mmObject();
				trace_lazy = () -> PriceSourceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceSource2Code.Fund, com.tools20022.repository.codeset.PriceSource2Code.Theoretical, com.tools20022.repository.codeset.PriceSource2Code.Vendor,
						com.tools20022.repository.codeset.PriceSource2Code.StockExchange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fund.getCodeName().get(), Fund);
		codesByName.put(Theoretical.getCodeName().get(), Theoretical);
		codesByName.put(Vendor.getCodeName().get(), Vendor);
		codesByName.put(StockExchange.getCodeName().get(), StockExchange);
	}

	public static PriceSource2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceSource2Code[] values() {
		PriceSource2Code[] values = new PriceSource2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceSource2Code> {
		@Override
		public PriceSource2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceSource2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}