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
import com.tools20022.repository.codeset.TaxType11Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of tax.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType11Code#Provincial
 * TaxType11Code.Provincial}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType11Code#NationalTax
 * TaxType11Code.NationalTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType11Code#StateTax
 * TaxType11Code.StateTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#WithholdingTax
 * TaxType11Code.WithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#CapitalGainTax
 * TaxType11Code.CapitalGainTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#InterimProfitTax
 * TaxType11Code.InterimProfitTax}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType11Code#StampDuty
 * TaxType11Code.StampDuty}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType11Code#WealthTax
 * TaxType11Code.WealthTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#InheritanceTax
 * TaxType11Code.InheritanceTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#SolidaritySurcharge
 * TaxType11Code.SolidaritySurcharge}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType11Code#TaxCredit
 * TaxType11Code.TaxCredit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxType11Code#GiftTax
 * TaxType11Code.GiftTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#ConsumptionTax
 * TaxType11Code.ConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#EUTaxRetention
 * TaxType11Code.EUTaxRetention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#Aktiengewinn1
 * TaxType11Code.Aktiengewinn1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#Aktiengewinn2
 * TaxType11Code.Aktiengewinn2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxType11Code#Zwischengewinn
 * TaxType11Code.Zwischengewinn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxTypeCode TaxTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PROV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxType11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of tax."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxType11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Provincial"</li>
	 * </ul>
	 */
	public static final TaxType11Code Provincial = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Provincial";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.Provincial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalTax"</li>
	 * </ul>
	 */
	public static final TaxType11Code NationalTax = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.NationalTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StateTax"</li>
	 * </ul>
	 */
	public static final TaxType11Code StateTax = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StateTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.StateTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * </ul>
	 */
	public static final TaxType11Code WithholdingTax = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.WithholdingTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainTax"</li>
	 * </ul>
	 */
	public static final TaxType11Code CapitalGainTax = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.CapitalGainTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimProfitTax"</li>
	 * </ul>
	 */
	public static final TaxType11Code InterimProfitTax = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimProfitTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.InterimProfitTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDuty"</li>
	 * </ul>
	 */
	public static final TaxType11Code StampDuty = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDuty";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.StampDuty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WealthTax"</li>
	 * </ul>
	 */
	public static final TaxType11Code WealthTax = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WealthTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.WealthTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InheritanceTax"</li>
	 * </ul>
	 */
	public static final TaxType11Code InheritanceTax = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InheritanceTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.InheritanceTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolidaritySurcharge"</li>
	 * </ul>
	 */
	public static final TaxType11Code SolidaritySurcharge = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolidaritySurcharge";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.SolidaritySurcharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCredit"</li>
	 * </ul>
	 */
	public static final TaxType11Code TaxCredit = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.TaxCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GiftTax"</li>
	 * </ul>
	 */
	public static final TaxType11Code GiftTax = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GiftTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.GiftTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumptionTax"</li>
	 * </ul>
	 */
	public static final TaxType11Code ConsumptionTax = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.ConsumptionTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUTaxRetention"</li>
	 * </ul>
	 */
	public static final TaxType11Code EUTaxRetention = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUTaxRetention";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.EUTaxRetention.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aktiengewinn1"</li>
	 * </ul>
	 */
	public static final TaxType11Code Aktiengewinn1 = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aktiengewinn1";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.Aktiengewinn1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aktiengewinn2"</li>
	 * </ul>
	 */
	public static final TaxType11Code Aktiengewinn2 = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aktiengewinn2";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.Aktiengewinn2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxType11Code
	 * TaxType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Zwischengewinn"</li>
	 * </ul>
	 */
	public static final TaxType11Code Zwischengewinn = new TaxType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Zwischengewinn";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxType11Code.mmObject();
			codeName = TaxTypeCode.Zwischengewinn.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxType11Code> codesByName = new LinkedHashMap<>();

	protected TaxType11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PROV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxType11Code";
				definition = "Specifies the type of tax.";
				trace_lazy = () -> TaxTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxType11Code.Provincial, com.tools20022.repository.codeset.TaxType11Code.NationalTax, com.tools20022.repository.codeset.TaxType11Code.StateTax,
						com.tools20022.repository.codeset.TaxType11Code.WithholdingTax, com.tools20022.repository.codeset.TaxType11Code.CapitalGainTax, com.tools20022.repository.codeset.TaxType11Code.InterimProfitTax,
						com.tools20022.repository.codeset.TaxType11Code.StampDuty, com.tools20022.repository.codeset.TaxType11Code.WealthTax, com.tools20022.repository.codeset.TaxType11Code.InheritanceTax,
						com.tools20022.repository.codeset.TaxType11Code.SolidaritySurcharge, com.tools20022.repository.codeset.TaxType11Code.TaxCredit, com.tools20022.repository.codeset.TaxType11Code.GiftTax,
						com.tools20022.repository.codeset.TaxType11Code.ConsumptionTax, com.tools20022.repository.codeset.TaxType11Code.EUTaxRetention, com.tools20022.repository.codeset.TaxType11Code.Aktiengewinn1,
						com.tools20022.repository.codeset.TaxType11Code.Aktiengewinn2, com.tools20022.repository.codeset.TaxType11Code.Zwischengewinn);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Provincial.getCodeName().get(), Provincial);
		codesByName.put(NationalTax.getCodeName().get(), NationalTax);
		codesByName.put(StateTax.getCodeName().get(), StateTax);
		codesByName.put(WithholdingTax.getCodeName().get(), WithholdingTax);
		codesByName.put(CapitalGainTax.getCodeName().get(), CapitalGainTax);
		codesByName.put(InterimProfitTax.getCodeName().get(), InterimProfitTax);
		codesByName.put(StampDuty.getCodeName().get(), StampDuty);
		codesByName.put(WealthTax.getCodeName().get(), WealthTax);
		codesByName.put(InheritanceTax.getCodeName().get(), InheritanceTax);
		codesByName.put(SolidaritySurcharge.getCodeName().get(), SolidaritySurcharge);
		codesByName.put(TaxCredit.getCodeName().get(), TaxCredit);
		codesByName.put(GiftTax.getCodeName().get(), GiftTax);
		codesByName.put(ConsumptionTax.getCodeName().get(), ConsumptionTax);
		codesByName.put(EUTaxRetention.getCodeName().get(), EUTaxRetention);
		codesByName.put(Aktiengewinn1.getCodeName().get(), Aktiengewinn1);
		codesByName.put(Aktiengewinn2.getCodeName().get(), Aktiengewinn2);
		codesByName.put(Zwischengewinn.getCodeName().get(), Zwischengewinn);
	}

	public static TaxType11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxType11Code[] values() {
		TaxType11Code[] values = new TaxType11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxType11Code> {
		@Override
		public TaxType11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxType11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}