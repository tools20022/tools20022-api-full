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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PriceSource1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the source of a price quotation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceSource1Code#Fund
 * PriceSource1Code.Fund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceSource1Code#Theoretical
 * PriceSource1Code.Theoretical}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceSource1Code#Vendor
 * PriceSource1Code.Vendor}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :94B:PRIC//</li>
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
 * "PriceSource1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the source of a price quotation."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PriceSource2Code
 * PriceSource2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceSource1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource1Code
	 * PriceSource1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fund"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.PriceSource2Code#Fund
	 * PriceSource2Code.Fund}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PriceSource1Code Fund = new PriceSource1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fund";
			nextVersions_lazy = () -> Arrays.asList(PriceSource2Code.Fund);
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSource1Code.mmObject();
			codeName = PriceSourceCode.Fund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource1Code
	 * PriceSource1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Theoretical"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PriceSource2Code#Theoretical
	 * PriceSource2Code.Theoretical}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PriceSource1Code Theoretical = new PriceSource1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Theoretical";
			nextVersions_lazy = () -> Arrays.asList(PriceSource2Code.Theoretical);
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSource1Code.mmObject();
			codeName = PriceSourceCode.Theoretical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceSource1Code
	 * PriceSource1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vendor"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.PriceSource2Code#Vendor
	 * PriceSource2Code.Vendor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final PriceSource1Code Vendor = new PriceSource1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vendor";
			nextVersions_lazy = () -> Arrays.asList(PriceSource2Code.Vendor);
			owner_lazy = () -> com.tools20022.repository.codeset.PriceSource1Code.mmObject();
			codeName = PriceSourceCode.Vendor.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PriceSource1Code> codesByName = new LinkedHashMap<>();

	protected PriceSource1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B:PRIC//"));
				example = Arrays.asList("FUND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceSource1Code";
				definition = "Indicates the source of a price quotation.";
				nextVersions_lazy = () -> Arrays.asList(PriceSource2Code.mmObject());
				trace_lazy = () -> PriceSourceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceSource1Code.Fund, com.tools20022.repository.codeset.PriceSource1Code.Theoretical, com.tools20022.repository.codeset.PriceSource1Code.Vendor);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fund.getCodeName().get(), Fund);
		codesByName.put(Theoretical.getCodeName().get(), Theoretical);
		codesByName.put(Vendor.getCodeName().get(), Vendor);
	}

	public static PriceSource1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceSource1Code[] values() {
		PriceSource1Code[] values = new PriceSource1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceSource1Code> {
		@Override
		public PriceSource1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceSource1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}